package it.cynerea.project.be.model.dao.character.id;

import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.skill.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CharacterSkillId {
    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(optional = false)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharacterSkillId that)) return false;
        return Objects.equals(getCharacter().getId(), that.getCharacter().getId()) && Objects.equals(getSkill().getId(), that.getSkill().getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCharacter().getId(), getSkill().getId());
    }
}