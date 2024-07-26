package it.cynerea.project.be.model.dao.system;

import it.cynerea.project.be.model.dao.system.id.ManagementLogId;
import it.cynerea.project.be.model.enums.ManagementLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "management_log")
public class ManagementLog {
    @EmbeddedId
    private ManagementLogId id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ManagementLogType type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManagementLog that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}