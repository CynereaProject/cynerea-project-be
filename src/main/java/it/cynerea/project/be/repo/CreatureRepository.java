package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Chat;
import it.cynerea.project.be.model.dao.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatureRepository extends JpaRepository<Creature, Long> {
}
