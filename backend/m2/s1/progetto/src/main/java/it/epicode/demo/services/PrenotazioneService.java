package it.epicode.demo.services;

import it.epicode.demo.entities.Prenotazioni;
import it.epicode.demo.entities.Utente;
import it.epicode.demo.repository.PrenotazioniRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioniRepository prenotazioniDao;

    @Autowired
    PostazioneService postazioneService;

    public Prenotazioni save(Prenotazioni prenotazioni){
        return prenotazioniDao.save(prenotazioni);
    }



    public void crea(Long postazioneId, Utente utenti, LocalDate dataPrenotazione)
    {
        var postazione = postazioneService.findById(postazioneId);
        if (postazione == null) {
            log.info("NON ESISTE LA POSTAZIONE CHE CERCHI");

        } else if ((postazione.getOccupantiMax() - prenotazioniDao.findByDataPrenotazioneAndPostazioneId(dataPrenotazione,postazioneId).size()) == 0) {
            log.info("NON CI SONO PIU POSTI DISPONIBILI PER LA DATA " + dataPrenotazione);

        } else {
            log.info("PRENOTAZIONE ESEGUITA");
            var prenotazione = new Prenotazioni(postazione, utenti, dataPrenotazione);
            prenotazioniDao.save(prenotazione);
        }
    }
}
