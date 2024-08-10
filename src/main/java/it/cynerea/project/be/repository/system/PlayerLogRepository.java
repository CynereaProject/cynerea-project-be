package it.cynerea.project.be.repository.system;

import it.cynerea.project.be.model.dao.system.PlayerLog;
import it.cynerea.project.be.model.dao.system.id.PlayerLogId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerLogRepository extends JpaRepository<PlayerLog, PlayerLogId> {
}