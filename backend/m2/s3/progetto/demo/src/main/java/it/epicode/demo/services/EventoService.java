package it.epicode.demo.services;

import it.epicode.demo.controllers.records.EventoRequest;
import it.epicode.demo.entities.Evento;
import it.epicode.demo.repositories.EventoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class EventoService {

    @Autowired
    EventoRepository evento;

    public Evento save(EventoRequest e){
        Evento ev = new Evento(
                e.nome(),
                e.descrizione(),
                e.data(),
                e.luogo(),
                e.numeroPosti()
        );
        return evento.save(ev);
        
    }


}
