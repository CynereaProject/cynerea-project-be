package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Talent;
import it.cynerea.project.be.model.dao.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitRepository extends JpaRepository<Trait, Integer> {
}
