package it.cynerea.project.be.model.dao.relation;

import it.cynerea.project.be.model.dao.id.CharacterSkillId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@Table(name = "character_skill")
public class CharacterSkill {
    @EmbeddedId
    private CharacterSkillId id;

    @Column(name = "skill_level", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer skillLevel;

}