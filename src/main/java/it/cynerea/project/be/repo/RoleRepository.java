package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Race;
import it.cynerea.project.be.model.dao.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
