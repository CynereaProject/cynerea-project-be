package it.cynerea.project.be.model.dao.relation;

import it.cynerea.project.be.model.dao.id.CreatureCapacityId;
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
@Table(name = "creature_capacity")
public class CreatureCapacity {
    @EmbeddedId
    private CreatureCapacityId id;

    @Column(name = "level", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer level;
}