package it.cynerea.project.be.repository.action;

import it.cynerea.project.be.model.dao.action.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, String> {
}