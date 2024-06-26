package it.epicode.demo.config;

import it.epicode.demo.entities.Ruoli;
import it.epicode.demo.services.RuoloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    @Autowired
    RuoloService ruolo;

    @Override
    public void run(String... args) throws Exception {

        try {
            ruolo.save(("organizzatore"));
            ruolo.save(("utente"));
        } catch (Exception e) {
            log.error("Impossibile salvare");
        }
    }
}
