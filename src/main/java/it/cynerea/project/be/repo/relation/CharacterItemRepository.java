package it.cynerea.project.be.repo.relation;

import it.cynerea.project.be.model.dao.Character;
import it.cynerea.project.be.model.dao.Item;
import it.cynerea.project.be.model.dao.id.AwakeningSkillId;
import it.cynerea.project.be.model.dao.relation.AwakeningSkill;
import it.cynerea.project.be.model.dao.relation.CharacterItem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.URL;
import java.util.UUID;

@Repository
public interface CharacterItemRepository extends JpaRepository<CharacterItem, UUID> {
}