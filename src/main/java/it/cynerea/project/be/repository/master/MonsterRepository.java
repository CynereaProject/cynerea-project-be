package it.cynerea.project.be.repository.master;

import it.cynerea.project.be.model.dao.master.Monster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, Long> {
}