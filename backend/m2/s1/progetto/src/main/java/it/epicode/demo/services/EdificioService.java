package it.epicode.demo.services;

import it.epicode.demo.entities.Edificio;
import it.epicode.demo.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {

    @Autowired
    EdificioRepository edificioDao;


    public void save(Edificio edificio){edificioDao.save(edificio);}
}
