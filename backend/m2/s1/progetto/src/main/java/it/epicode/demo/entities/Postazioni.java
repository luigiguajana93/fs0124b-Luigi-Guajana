package it.epicode.demo.entities;

import jakarta.persistence.*;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Entity

@Table(name = "postazioni")
@Data


public class Postazioni extends Base {

    private String descrizione;
    private TipoPostazione tipo;
    private int occupantiMax;


    @OneToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @Builder(setterPrefix = "with")
    public Postazioni( String descrizione, TipoPostazione tipo, int occupantiMax,  Edificio edificio) {

        this.descrizione = descrizione;
        this.tipo = tipo;
        this.occupantiMax = occupantiMax;
        this.edificio = edificio;
    }

    public Postazioni() {

    }
}