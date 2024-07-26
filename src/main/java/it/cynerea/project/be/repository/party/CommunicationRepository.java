package it.cynerea.project.be.repository.party;

import it.cynerea.project.be.model.dao.party.Communication;
import it.cynerea.project.be.model.dao.party.id.CommunicationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, CommunicationId> {
}