package it.epicode.demo.controllers.records;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UtenteRequest(
        @NotBlank
        @NotNull(message = "Nome è obbligatorio")
        String nome,
        @NotNull(message = "Ruolo è obbligatorio")
        Long ruoloId){
}
