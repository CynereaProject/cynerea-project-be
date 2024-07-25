package it.cynerea.project.be.model.dao.system;

import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.id.PlayerIpId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "sys_player_ip")
@NoArgsConstructor
public class PlayerIp {
    @EmbeddedId
    private PlayerIpId id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerIp playerIp)) return false;
        return Objects.equals(getId(), playerIp.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    public PlayerIp(Player player, String ip) {
        PlayerIpId id = new PlayerIpId();
        id.setPlayer(player);
        id.setIp(ip);
        this.id = id;
    }
}