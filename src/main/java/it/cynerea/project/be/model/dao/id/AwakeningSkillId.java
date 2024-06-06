package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Awakening;
import it.cynerea.project.be.model.dao.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class AwakeningSkillId implements Serializable {

    @ManyToOne(optional = false)
    private Awakening awakening;

    @OneToOne(optional = false, orphanRemoval = true)
    private Skill skill;
}