package it.cynerea.project.be.model.dao.system.id;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ManagementLogId {
    @ManyToOne(optional = false)
    private Player player;

    @Column(name = "resource", nullable = false)
    private String resource;

    @Column(name = "date", nullable = false)
    private Timestamp date = new Timestamp(Instant.now().toEpochMilli());

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManagementLogId that)) return false;
        return Objects.equals(getPlayer().getId(), that.getPlayer().getId()) && Objects.equals(getResource(), that.getResource()) && Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayer().getId(), getResource(), getDate());
    }
}