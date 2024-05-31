package it.epicode.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="utenti")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Utente extends Base{
    private String nome;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "ruolo_id")
    private Ruoli ruolo;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "utente_id")
    private List<Evento> evento;

    @Builder(setterPrefix = "with")
    public Utente(Ruoli ruolo, String nome) {
        this.ruolo = ruolo;
        this.nome = nome;
    }
    public void addEvento(Evento e) {
        this.evento.add(e);
    }
}
