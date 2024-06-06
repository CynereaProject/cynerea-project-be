package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Race;
import it.cynerea.project.be.model.dao.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class RaceSkillId implements Serializable {
    @ManyToOne(optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;
}