package it.cynerea.project.be.repository.chat;

import it.cynerea.project.be.model.dao.chat.Influence;
import it.cynerea.project.be.model.dao.chat.id.InfluenceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfluenceRepository extends JpaRepository<Influence, InfluenceId> {
}