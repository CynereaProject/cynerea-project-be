package it.cynerea.project.be.repository.player;

import it.cynerea.project.be.model.dao.player.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}