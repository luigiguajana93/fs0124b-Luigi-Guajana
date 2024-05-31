package it.epicode.demo.controllers;


import it.epicode.demo.controllers.records.UtenteRequest;
import it.epicode.demo.entities.Utente;
import it.epicode.demo.services.UtenteService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utente")
public class UtenteController {

    @Autowired
    private UtenteService utenteService;
    @PostMapping
    public ResponseEntity<Utente> saveUtente(@Validated @RequestBody UtenteRequest request, BindingResult validator) throws BadRequestException {
        if (validator.hasErrors()) {
            throw new BadRequestException(String.valueOf(validator.getAllErrors()));
        }

        return ResponseEntity.ok(utenteService.save(request));
    }
}
