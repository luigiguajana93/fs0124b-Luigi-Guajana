package it.epicode.demo;

import it.epicode.demo.entities.AppConfig;
import it.epicode.demo.services.EdificioService;
import it.epicode.demo.services.PostazioneService;
import it.epicode.demo.services.PrenotazioneService;
import it.epicode.demo.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private UtenteService utenteService;
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    AppConfig appConfig;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    try {
        var utente1 = appConfig.LuigiBean();
        utenteService.save(utente1);
        var utente2 = appConfig.FilippoBean();
        utenteService.save(utente2);
        var utente3 = appConfig.PaoloBean();
        utenteService.save(utente3);

        var edificio1 = appConfig.primoEdificio();
        edificioService.save(edificio1);
        var edificio2 = appConfig.secondoEdificio();
        edificioService.save(edificio2);
        var edificio3 = appConfig.terzoEdificio();
        edificioService.save(edificio3);

        var postazione1 = appConfig.posto01();
        postazioneService.save(postazione1);
        var postazione2 = appConfig.posto02();
        postazioneService.save(postazione2);
        var postazione3 = appConfig.posto03();
        postazioneService.save(postazione3);

        var prenotazione1 = prenotazioneService.crea(1L,utente1, LocalDate.now());
        prenotazioneService.save(prenotazione1);

    }catch (Exception ex){
        System.err.println(ex.getMessage());
    }
    }
}
