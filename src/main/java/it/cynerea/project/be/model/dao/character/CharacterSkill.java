package it.cynerea.project.be.model.dao.character;

import it.cynerea.project.be.model.dao.character.id.CharacterSkillId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "ch_character_skill")
public class CharacterSkill {
    @EmbeddedId
    private CharacterSkillId id;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharacterSkill that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}