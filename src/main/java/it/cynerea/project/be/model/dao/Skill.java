package it.cynerea.project.be.model.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.net.URL;

@Getter
@Setter
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "mana_cost")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer manaCost;


    @Column(name = "life_cost")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer lifeCost;

    @Lob
    @Column(name = "effect", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String effect;

    @Column(name = "img", nullable = false)
    private String img;

    @Column(name = "max_level")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer maxLevel;

}
