package it.cynerea.project.be.model.dao.relation;

import it.cynerea.project.be.model.dao.id.RaceSkillId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@Table(name = "race_skill")
public class RaceSkill {
    @EmbeddedId
    private RaceSkillId id;

    @Column(name = "character_level_required", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer characterLevelRequired;
}