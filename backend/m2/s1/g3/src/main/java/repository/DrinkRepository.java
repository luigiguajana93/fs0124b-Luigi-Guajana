package repository;

import it.epicode.spring.data.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository <Drink,Long> {
}
