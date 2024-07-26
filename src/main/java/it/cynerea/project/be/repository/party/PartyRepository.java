package it.cynerea.project.be.repository.party;

import it.cynerea.project.be.model.dao.party.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, String> {
}