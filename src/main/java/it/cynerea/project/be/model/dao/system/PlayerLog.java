package it.cynerea.project.be.model.dao.system;

import it.cynerea.project.be.model.dao.system.id.PlayerLogId;
import it.cynerea.project.be.model.enums.PlayerLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "sys_player_log")
public class PlayerLog {
    @EmbeddedId
    private PlayerLogId id;

    @Column(name = "cause", nullable = false)
    private String cause;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private PlayerLogType type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerLog playerLog)) return false;
        return Objects.equals(getId(), playerLog.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}