package it.epicode.demo.controllers;

import it.epicode.demo.controllers.records.EventoRequest;
import it.epicode.demo.entities.Evento;
import it.epicode.demo.services.EventoService;
import it.epicode.demo.services.UtenteService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public ResponseEntity<Evento> saveEvento(@Validated @RequestBody EventoRequest request, BindingResult validator) throws BadRequestException {
        if (validator.hasErrors()) {
            throw new BadRequestException(String.valueOf(validator.getAllErrors()));
        }

        return ResponseEntity.ok(eventoService.save(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> updateEvento(@PathVariable Long id, @Validated @RequestBody Evento request, BindingResult validator) throws BadRequestException {
        if(validator.hasErrors()){
            throw new BadRequestException(String.valueOf(validator.getAllErrors()));
        }
        Evento update = eventoService.update(id,request);
        return ResponseEntity.ok(update);
    }


    @PatchMapping("/prenota/{idUtente}/{idEvento}")
    public ResponseEntity<Evento> update(@PathVariable Long idUtente, @PathVariable Long idEvento){
        var prenotazione = eventoService.prenotazione(idUtente, idEvento);
        return ResponseEntity.ok(prenotazione);
    }
}
