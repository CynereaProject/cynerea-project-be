package it.cynerea.project.be.repository.character;

import it.cynerea.project.be.model.dao.character.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitRepository extends JpaRepository<Trait, Long> {
}