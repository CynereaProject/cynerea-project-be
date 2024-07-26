package it.cynerea.project.be.repository.awakening;

import it.cynerea.project.be.model.dao.awakening.AwakeningSkill;
import it.cynerea.project.be.model.dao.awakening.id.AwakeningSkillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwakeningSkillRepository extends JpaRepository<AwakeningSkill, AwakeningSkillId> {
}