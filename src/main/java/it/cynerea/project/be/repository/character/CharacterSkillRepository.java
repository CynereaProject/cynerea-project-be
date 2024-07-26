package it.cynerea.project.be.repository.character;

import it.cynerea.project.be.model.dao.character.CharacterSkill;
import it.cynerea.project.be.model.dao.character.id.CharacterSkillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterSkillRepository extends JpaRepository<CharacterSkill, CharacterSkillId> {
}