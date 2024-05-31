package it.epicode.demo.controllers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class BadRequestException extends ApiException{
    private static final long serialVersionUID = 1L;

    public BadRequestException(List<ObjectError> errors) {
        super(errors, HttpStatus.BAD_REQUEST, "Bad request");
    }
}
