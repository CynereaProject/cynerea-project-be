package it.cynerea.project.be.repository.skill;

import it.cynerea.project.be.model.dao.skill.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}