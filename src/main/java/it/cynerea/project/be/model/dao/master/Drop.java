package it.cynerea.project.be.model.dao.master;

import it.cynerea.project.be.model.dao.master.id.DropId;
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
@Table(name = "ms_drop")
public class Drop {
    @EmbeddedId
    private DropId id;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drop drop)) return false;
        return Objects.equals(getId(), drop.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}