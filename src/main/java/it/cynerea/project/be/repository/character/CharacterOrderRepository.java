package it.cynerea.project.be.repository.character;

import it.cynerea.project.be.model.dao.character.CharacterOrder;
import it.cynerea.project.be.model.dao.character.id.CharacterOrderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterOrderRepository extends JpaRepository<CharacterOrder, CharacterOrderId> {
}