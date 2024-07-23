package it.cynerea.project.be.model.dao.awakening.id;

import it.cynerea.project.be.model.dao.awakening.Awakening;
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
public class AwakeningSkillId {
    @ManyToOne(optional = false)
    @JoinColumn(name = "awakening_id", nullable = false)
    private Awakening awakening;

    @ManyToOne(optional = false)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AwakeningSkillId that)) return false;
        return Objects.equals(getAwakening().getId(), that.getAwakening().getId()) && Objects.equals(getSkill().getId(), that.getSkill().getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAwakening().getId(), getSkill().getId());
    }
}