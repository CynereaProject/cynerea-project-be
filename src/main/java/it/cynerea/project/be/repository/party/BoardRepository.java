package it.cynerea.project.be.repository.party;

import it.cynerea.project.be.model.dao.party.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, String> {
}