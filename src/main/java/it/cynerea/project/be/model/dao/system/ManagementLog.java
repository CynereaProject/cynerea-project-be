package it.cynerea.project.be.model.dao.system;

import it.cynerea.project.be.model.dao.system.id.ManagementLogId;
import it.cynerea.project.be.model.enums.ManagementLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "management_log")
public class ManagementLog {
    @EmbeddedId
    private ManagementLogId id;

    @Column(name = "cause", nullable = false)
    private String cause;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ManagementLogType type;

}