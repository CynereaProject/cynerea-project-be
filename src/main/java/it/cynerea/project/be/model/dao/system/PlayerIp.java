package it.cynerea.project.be.model.dao.system;

import it.cynerea.project.be.model.dao.system.id.PlayerIpId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sys_player_ip")
public class PlayerIp {
    @EmbeddedId
    private PlayerIpId id;
}