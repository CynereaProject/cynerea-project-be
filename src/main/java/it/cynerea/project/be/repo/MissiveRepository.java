package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Log;
import it.cynerea.project.be.model.dao.Missive;
import it.cynerea.project.be.model.dao.id.LogId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MissiveRepository extends JpaRepository<Missive, UUID> {
}
