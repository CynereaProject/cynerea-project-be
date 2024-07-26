package it.cynerea.project.be.repository.race;

import it.cynerea.project.be.model.dao.race.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
}