package it.epicode.demo.services;




import it.epicode.demo.controllers.records.UtenteRequest;
import it.epicode.demo.entities.Ruoli;
import it.epicode.demo.entities.Utente;
import it.epicode.demo.repositories.RuoliRepository;
import it.epicode.demo.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {

    @Autowired
    UtenteRepository utente;
    @Autowired
    RuoliRepository ruoli;


    public Utente save(UtenteRequest u){
        Ruoli r = ruoli.findById(u.ruoloid()).orElseThrow(() -> new RuntimeException("ruolo non c'è"));
        var ut = Utente.builder().withNome(u.nome()).withEmail(u.email()).withPassword(u.password()).withRuolo(r).build();
        return utente.save(ut);
    }



}
