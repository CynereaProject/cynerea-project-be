package it.cynerea.project.be.repository.chat;

import it.cynerea.project.be.model.dao.chat.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}