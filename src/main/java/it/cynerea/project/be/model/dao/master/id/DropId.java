package it.cynerea.project.be.model.dao.master.id;

import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.thing.Thing;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class DropId {

    @ManyToOne(optional = false)
    @JoinColumn(name = "master_id", nullable = false)
    private Player master;

    @ManyToOne(optional = false)
    @JoinColumn(name = "thing_id", nullable = false)
    private Thing thing;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DropId dropId)) return false;
        return Objects.equals(getMaster().getId(), dropId.getMaster().getId()) && Objects.equals(getThing().getId(), dropId.getThing().getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaster().getId(), getThing().getId());
    }
}