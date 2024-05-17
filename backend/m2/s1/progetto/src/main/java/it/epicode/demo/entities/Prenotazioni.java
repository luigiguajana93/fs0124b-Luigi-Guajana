package it.epicode.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data

public class Prenotazioni extends Base {
    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazioni postazioni;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utenti;
    private LocalDate dataPrenotazione;
    private LocalDate dataScadenza;

    @Builder(setterPrefix = "with")
    public Prenotazioni(Postazioni postazioni, Utente utenti, LocalDate dataPrenotazione) {

        this.postazioni = postazioni;
        this.utenti = utenti;
        this.dataPrenotazione = dataPrenotazione;
        this.dataScadenza = dataPrenotazione.plusDays(1);
    }
}
