package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Item;
import it.cynerea.project.be.model.dao.Log;
import it.cynerea.project.be.model.dao.id.LogId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, LogId> {
}
