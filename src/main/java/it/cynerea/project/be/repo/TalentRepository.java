package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Skill;
import it.cynerea.project.be.model.dao.Talent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalentRepository extends JpaRepository<Talent, Integer> {
}
