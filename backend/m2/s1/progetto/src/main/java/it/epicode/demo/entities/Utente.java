package it.epicode.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Builder(setterPrefix = "with")
@Table(name = "utenti")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utente extends Base{
    private String username;
    private String nome;
    private String cognome;
    private String email;
}
