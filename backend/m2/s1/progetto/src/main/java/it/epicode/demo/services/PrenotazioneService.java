package it.epicode.demo.services;

import it.epicode.demo.entities.Prenotazione;
import it.epicode.demo.entities.Utente;
import it.epicode.demo.repository.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Slf4j
@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneRepository prenotazioniDao;

    @Autowired
    PostazioneService postazioneService;

    public Prenotazione save(Prenotazione prenotazione){
        return prenotazioniDao.save(prenotazione);
    }

    //crea una prenotazione solo se esiste la postazione che stai cercando
    //solo se per quella data è libera
    //solo se l'utente non ha già un'altra prenotazione
    //nell'else la salva


    public void crea(Long postazioneId, Utente utenti, LocalDate dataPrenotazione)
    {
        var postazione = postazioneService.findById(postazioneId);
        if (postazione == null) {
            log.warn("NON ESISTE LA POSTAZIONE CHE CERCHI");

        } else if ((postazione.getOccupantiMax() - prenotazioniDao.findBydataPrenotazioneAndPostazioniId(dataPrenotazione, postazione.getId()).size()) == 0) {
            log.warn("NON CI SONO PIU POSTI DISPONIBILI PER LA DATA " + dataPrenotazione);

        } else {
            log.info("PRENOTAZIONE ESEGUITA");
            prenotazioniDao.save(new Prenotazione(postazione, utenti, dataPrenotazione));
               }
    }
}
