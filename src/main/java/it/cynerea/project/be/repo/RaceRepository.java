package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Quest;
import it.cynerea.project.be.model.dao.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RaceRepository extends JpaRepository<Race, Integer> {
}
