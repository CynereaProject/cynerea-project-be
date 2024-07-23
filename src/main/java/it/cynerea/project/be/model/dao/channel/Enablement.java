package it.cynerea.project.be.model.dao.channel;

import it.cynerea.project.be.model.dao.channel.id.EnablementId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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

}