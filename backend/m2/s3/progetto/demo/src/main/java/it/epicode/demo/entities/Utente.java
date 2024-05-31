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
@Builder(setterPrefix = "with")
public class Utente extends Base{
    private String nome;
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "ruolo_id")
    private Ruoli ruolo;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "utente_id")
    private List<Evento> evento = new ArrayList<>();

    public Utente(Ruoli ruolo, String nome) {
        this.ruolo = ruolo;
        this.nome = nome;
    }
}
