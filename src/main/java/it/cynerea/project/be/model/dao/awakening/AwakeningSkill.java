package it.cynerea.project.be.model.dao.awakening;

import it.cynerea.project.be.model.dao.awakening.id.AwakeningSkillId;
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
@Table(name = "aw_awakening_skill")
public class AwakeningSkill {
    @EmbeddedId
    private AwakeningSkillId id;

    @Column(name = "awakening_degree_request", nullable = false)
    private Integer awakeningDegreeRequest;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AwakeningSkill that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}