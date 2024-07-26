package it.cynerea.project.be.repository.party;

import it.cynerea.project.be.model.dao.party.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion, String> {
}