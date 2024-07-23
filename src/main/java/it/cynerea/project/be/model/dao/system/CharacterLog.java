package it.cynerea.project.be.model.dao.system;

import it.cynerea.project.be.model.dao.system.id.CharacterLogId;
import it.cynerea.project.be.model.enums.CharacterLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sys_character_log")
public class CharacterLog {
    @EmbeddedId
    private CharacterLogId id;

    @Column(name = "cause", nullable = false)
    private String cause;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private CharacterLogType type;
}