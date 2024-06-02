package it.epicode.demo.repositories;

import it.epicode.demo.entities.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Long> {

    Prenotazioni findByUtenteIdAndEventoId(Long idUtente, Long idEvento);
}
