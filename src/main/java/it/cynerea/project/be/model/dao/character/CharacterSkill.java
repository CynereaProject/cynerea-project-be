package it.cynerea.project.be.model.dao.character;

import it.cynerea.project.be.model.dao.character.id.CharacterSkillId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ch_character_skill")
public class CharacterSkill {
    @EmbeddedId
    private CharacterSkillId id;

    @Column(name = "level", nullable = false)
    private Integer level;

}