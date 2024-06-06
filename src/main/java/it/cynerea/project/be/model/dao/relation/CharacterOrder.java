package it.cynerea.project.be.model.dao.relation;

import it.cynerea.project.be.model.dao.id.CharacterOrderId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@Table(name = "character_order")
public class CharacterOrder {

    @EmbeddedId
    private CharacterOrderId id;

    @Column(name = "level", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer level;

    @Column(name = "is_excellence", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isExcellence = false;
}