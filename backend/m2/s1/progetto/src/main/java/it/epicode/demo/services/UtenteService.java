package it.epicode.demo.services;

import it.epicode.demo.entities.AppConfig;
import it.epicode.demo.entities.Utente;
import it.epicode.demo.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    UtenteRepository utenteDao;


    public void save(Utente utente){utenteDao.save(utente);}


}
