package it.cynerea.project.be.repository.master;

import it.cynerea.project.be.model.dao.master.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends JpaRepository<Rank, String> {
}