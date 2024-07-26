package it.cynerea.project.be.repository.system;

import it.cynerea.project.be.model.dao.system.ManagementLog;
import it.cynerea.project.be.model.dao.system.id.ManagementLogId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementLogRepository extends JpaRepository<ManagementLog, ManagementLogId> {
}