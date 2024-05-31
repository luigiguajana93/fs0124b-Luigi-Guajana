package it.epicode.demo.controllers.records;

import it.epicode.demo.entities.Ruoli;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record UtenteRequest
    (@NotNull(message = "Nome è obbligatorio")
    String nome,
    @NotEmpty
    @NotNull(message = "Ruolo è obbligatorio")
     Long ruoloId){
}
