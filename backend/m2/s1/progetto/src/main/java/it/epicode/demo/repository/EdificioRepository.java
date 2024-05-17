package it.epicode.demo.repository;

import it.epicode.demo.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EdificioRepository extends JpaRepository<Edificio,Long> {
}
