package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Capacity;
import it.cynerea.project.be.model.dao.Creature;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CreatureCapacityId implements Serializable {
    @ManyToOne(optional = false)
    private Creature creature;

    @ManyToOne(optional = false)
    private Capacity capacity;
}