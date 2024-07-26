package it.cynerea.project.be.repository.system;

import it.cynerea.project.be.model.dao.system.PlayerIp;
import it.cynerea.project.be.model.dao.system.id.PlayerIpId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerIpRepository extends JpaRepository<PlayerIp, PlayerIpId> {
}