package it.cynerea.project.be.repository.channel;

import it.cynerea.project.be.model.dao.channel.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, String> {
}