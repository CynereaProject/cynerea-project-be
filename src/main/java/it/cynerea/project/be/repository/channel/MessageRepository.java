package it.cynerea.project.be.repository.channel;

import it.cynerea.project.be.model.dao.channel.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, String> {
}