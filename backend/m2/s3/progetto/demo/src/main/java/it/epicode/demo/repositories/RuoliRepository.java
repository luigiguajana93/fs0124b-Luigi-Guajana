package it.epicode.demo.repositories;

import it.epicode.demo.entities.Ruoli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuoliRepository extends JpaRepository<Ruoli,Long> {
}
