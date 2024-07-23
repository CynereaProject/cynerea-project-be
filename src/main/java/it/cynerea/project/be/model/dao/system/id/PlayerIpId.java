package it.cynerea.project.be.model.dao.system.id;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PlayerIpId {
    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Column(name = "ip", nullable = false, length = 39)
    private String ip;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerIpId that)) return false;
        return Objects.equals(getPlayer().getId(), that.getPlayer().getId()) && Objects.equals(getIp(), that.getIp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayer().hashCode(), getIp().hashCode());
    }
}