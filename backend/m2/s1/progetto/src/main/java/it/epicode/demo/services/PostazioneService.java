package it.epicode.demo.services;

import it.epicode.demo.entities.Edificio;
import it.epicode.demo.entities.Postazioni;
import it.epicode.demo.repository.EdificioRepository;
import it.epicode.demo.repository.PostazioniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {

    @Autowired
    PostazioniRepository postazioniDao;


    public void save(Postazioni postazione){postazioniDao.save(postazione);}

    public Postazioni findById(Long id){
        return postazioniDao.findById(id).orElseThrow();
    }
}
