package it.cynerea.project.be.repository.player;

import it.cynerea.project.be.model.dao.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< Updated upstream
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
}
=======
import java.util.Optional;
import java.util.UUID;
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    Optional<Player> findByUsernameAndPassword(String username, String password);
}
>>>>>>> Stashed changes
