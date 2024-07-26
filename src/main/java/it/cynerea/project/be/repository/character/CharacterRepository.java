package it.cynerea.project.be.repository.character;

import it.cynerea.project.be.model.dao.character.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, String> {
}