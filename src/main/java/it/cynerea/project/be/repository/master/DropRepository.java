package it.cynerea.project.be.repository.master;

import it.cynerea.project.be.model.dao.master.Drop;
import it.cynerea.project.be.model.dao.master.id.DropId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DropRepository extends JpaRepository<Drop, DropId> {
}