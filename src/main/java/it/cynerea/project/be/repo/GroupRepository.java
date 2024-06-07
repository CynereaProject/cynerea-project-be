package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Creature;
import it.cynerea.project.be.model.dao.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
}
