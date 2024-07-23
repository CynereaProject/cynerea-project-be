package it.cynerea.project.be.model.dao.awakening;

import it.cynerea.project.be.model.dao.awakening.id.AwakeningSkillId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "aw_awakening_skill")
public class AwakeningSkill {
    @EmbeddedId
    private AwakeningSkillId id;

    @Column(name = "awakening_degree_request", nullable = false)
    private Integer awakeningDegreeRequest;

}