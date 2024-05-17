package it.epicode.demo.repository;


import it.epicode.demo.entities.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioniRepository extends JpaRepository<Prenotazioni,Long> {

    List<Prenotazioni> findByDataPrenotazioneAndPostazioneId(LocalDate data,Long PostazioneId);
}
