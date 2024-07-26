package it.cynerea.project.be.repository.system;

import it.cynerea.project.be.model.dao.system.CharacterLog;
import it.cynerea.project.be.model.dao.system.id.CharacterLogId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterLogRepository extends JpaRepository<CharacterLog, CharacterLogId> {
}