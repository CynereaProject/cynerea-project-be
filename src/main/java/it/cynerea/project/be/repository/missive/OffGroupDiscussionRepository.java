package it.cynerea.project.be.repository.missive;

import it.cynerea.project.be.model.dao.missive.OffGroupDiscussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffGroupDiscussionRepository extends JpaRepository<OffGroupDiscussion, String> {
}