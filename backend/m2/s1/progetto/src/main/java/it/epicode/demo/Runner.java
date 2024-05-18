package it.epicode.demo;

import it.epicode.demo.entities.AppConfig;
import it.epicode.demo.entities.TipoPostazione;
import it.epicode.demo.services.EdificioService;
import it.epicode.demo.services.PostazioneService;
import it.epicode.demo.services.PrenotazioneService;
import it.epicode.demo.services.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    @Autowired
    private UtenteService utenteService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private EdificioService edificioService;


    @Autowired
    AppConfig appConfig;

    @Override
    public void run(String... args) throws Exception {
        //inizializzo le istanze che mi servono
    try {
        var utente1 = appConfig.LuigiBean();
        var utente2 = appConfig.FilippoBean();
        var utente3 = appConfig.PaoloBean();
        utenteService.save(utente1);
        utenteService.save(utente2);
        utenteService.save(utente3);

        var edificio1 = appConfig.primoEdificio();
        var edificio2 = appConfig.secondoEdificio();
        var edificio3 = appConfig.terzoEdificio();
        edificioService.save(edificio1);
        edificioService.save(edificio2);
        edificioService.save(edificio3);

        var postazione1 = appConfig.posto01();
        var postazione2 = appConfig.posto02();
        var postazione3 = appConfig.posto03();
        postazioneService.save(postazione1);
        postazioneService.save(postazione2);
        postazioneService.save(postazione3);

        prenotazioneService.crea(1L,utente1, LocalDate.now());
        //prova che non posso prenotare per lo stesso giorno
        prenotazioneService.crea(2L,utente1, LocalDate.now());


        postazioneService.cercaPostazione(TipoPostazione.OPENSPACE,"Roma");

    }catch (Exception ex){
        System.err.println(ex.getMessage());
    }
    }
}
