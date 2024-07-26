package it.cynerea.project.be.repository.channel;

import it.cynerea.project.be.model.dao.channel.Enablement;
import it.cynerea.project.be.model.dao.channel.id.EnablementId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnablementRepository extends JpaRepository<Enablement, EnablementId> {
}