package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Section;
import it.cynerea.project.be.model.dao.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
