package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.dao.relation.CreatureCapacity;
import it.cynerea.project.be.model.enums.Affinity;
import it.cynerea.project.be.model.enums.Rank;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "creature")
public class Creature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @Column(name = "img", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private URL img;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "rank", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Rank rank;

    @Lob
    @Column(name = "techniques", nullable = false)
    private String techniques;

    @OneToMany(mappedBy = "id.creature", orphanRemoval = true)
    private Set<CreatureCapacity> capacities = new LinkedHashSet<>();

    /*PRIMARY STATS*/
    @Column(name = "strength")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer strength;

    @Column(name = "dexterity")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer dexterity;

    @Column(name = "insight")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer insight;

    @Column(name = "mind")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer mind;

    @Column(name = "presence")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer presence;

    /*SECONDARY STATS*/
    @Column(name = "life")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer life;

    @Column(name = "mana")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer mana;

    @Column(name = "dodge")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer dodge;

    @Column(name = "temper")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer temper;

    @Column(name = "resistance")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer resistance;

    /*RESISTANCES*/
    @Enumerated(EnumType.STRING)
    @Column(name = "physical")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity physical;

    @Enumerated(EnumType.STRING)
    @Column(name = "air")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity air;

    @Enumerated(EnumType.STRING)
    @Column(name = "water")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity water;

    @Enumerated(EnumType.STRING)
    @Column(name = "earth")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity earth;

    @Enumerated(EnumType.STRING)
    @Column(name = "fire")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity fire;

    @Enumerated(EnumType.STRING)
    @Column(name = "lightning")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity lightning;

    @Enumerated(EnumType.STRING)
    @Column(name = "light")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity light;

    @Enumerated(EnumType.STRING)
    @Column(name = "dark")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity dark;

    @Enumerated(EnumType.STRING)
    @Column(name = "poison")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity poison;

}