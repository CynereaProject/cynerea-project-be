package it.cynerea.project.be.model.dao.system;

import it.cynerea.project.be.model.dao.system.id.PlayerLogId;
import it.cynerea.project.be.model.enums.PlayerLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
}