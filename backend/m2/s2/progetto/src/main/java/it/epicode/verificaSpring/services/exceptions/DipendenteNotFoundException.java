package it.epicode.verificaSpring.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class DipendenteNotFoundException extends ApiException {
    private static final Long serialVersionUID = 1L;

    public DipendenteNotFoundException(List<ObjectError>errors){
        super(errors, HttpStatus.NOT_FOUND,"Dipendente non trovato");
    }
}
