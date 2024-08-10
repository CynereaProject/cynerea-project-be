package it.cynerea.project.be.repository.system;

import it.cynerea.project.be.model.dao.system.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< Updated upstream
@Repository
public interface TokenRepository extends JpaRepository<Token, String> {
}
=======
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, String> {

    Optional<Token> findByTokenAndPlayer_Roles_Group_NameIn(String token, String[] roles);

    void deleteByPlayer_Id(String id);
}
>>>>>>> Stashed changes
