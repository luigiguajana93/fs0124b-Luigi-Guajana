package it.epicode.verificaSpring.controllers.records;


import it.epicode.verificaSpring.enums.StatoDispositivo;
import it.epicode.verificaSpring.enums.TipoDispositivo;
import jakarta.validation.constraints.NotNull;

public record DispositiviRequest(
    @NotNull(message = "TipoDispositivo richiesto")
    TipoDispositivo tipo,
    @NotNull(message = "StatoDispositivo richiesto")
    StatoDispositivo stato) {


}
