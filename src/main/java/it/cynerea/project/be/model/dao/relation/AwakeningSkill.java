package it.cynerea.project.be.model.dao.relation;

import it.cynerea.project.be.model.dao.id.AwakeningSkillId;
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
@Table(name = "awakening_skill")
public class AwakeningSkill {
    @EmbeddedId
    private AwakeningSkillId id;

    @Column(name = "required_grade", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer requiredGrade;

}