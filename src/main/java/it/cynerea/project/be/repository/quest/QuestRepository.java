package it.cynerea.project.be.repository.quest;

import it.cynerea.project.be.model.dao.quest.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepository extends JpaRepository<Quest, String> {
}