package it.cynerea.project.be.model.dao.system.id;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PlayerLogId {

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @ManyToOne(optional = false)
    @JoinColumn(name = "target_id", nullable = false)
    private Player target;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerLogId that)) return false;
        return Objects.equals(getPlayer().getId(), that.getPlayer().getId()) && Objects.equals(getTarget().getId(), that.getTarget().getId()) && Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayer().hashCode(), getTarget().hashCode(), getDate());
    }
}