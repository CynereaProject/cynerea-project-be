package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Post;
import it.cynerea.project.be.model.dao.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuestRepository extends JpaRepository<Quest, UUID> {
}
