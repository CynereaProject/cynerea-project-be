package it.cynerea.project.be.model.dao.channel;

import it.cynerea.project.be.model.dao.channel.id.EnablementId;
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
@Table(name = "ch_enablement")
public class Enablement {
    @EmbeddedId
    private EnablementId id;

    @Column(name = "can_view", nullable = false)
    private Boolean canView = false;

    @Column(name = "can_write", nullable = false)
    private Boolean canWrite = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enablement that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}