package it.epicode.demo.controllers;

import it.epicode.demo.controllers.records.UtenteRequest;
import it.epicode.demo.entities.Utente;
import it.epicode.demo.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utente")
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @PostMapping
    public ResponseEntity<Utente> save(@Validated @RequestBody UtenteRequest request, BindingResult validator) {

}
