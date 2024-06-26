package it.epicode.demo.services;


import it.epicode.demo.entities.Ruoli;
import it.epicode.demo.repositories.RuoliRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RuoloService {

    @Autowired
    RuoliRepository ruoli;

    public Ruoli save(String name){
        Ruoli r = new Ruoli();
        r.setNome(name);
        ruoli.save(r);
        return r;
    }
}
