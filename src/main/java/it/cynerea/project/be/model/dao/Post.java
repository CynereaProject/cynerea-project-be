package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.dao.relation.CharacterSkill;
import it.cynerea.project.be.model.enums.Affinity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(optional = false)
    @JoinColumn(name = "chat_id", nullable = false)
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "quest_id")
    private Quest quest;

    @Temporal(TemporalType.TIME)
    @Column(name = "last_access")
    @JdbcTypeCode(SqlTypes.TIME)
    private Date lastAccess =  new Date();

    @Column(name = "is_report", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isReport = false;

    @Lob
    @Column(name = "text", nullable = false)
    private String text;

    @ManyToMany
    private Set<CharacterSkill> characterSkills = new LinkedHashSet<>();

    /*PRIMARY STATS*/
    @Column(name = "temporary_strength")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer temporaryStrength;

    @Column(name = "temporary_dexterity")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer temporaryDexterity;

    @Column(name = "temporary_insight")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer temporaryInsight;

    @Column(name = "temporary_mind")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer temporaryMind;

    @Column(name = "temporary_presence")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer temporaryPresence;

    /*SECONDARY STATS*/
    @Column(name = "life_modifier")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer lifeModifier;

    @Column(name = "mana_modifier")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer manaModifier;

    @Column(name = "temporary_dodge")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer temporaryDodge;

    @Column(name = "temporary_temper")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer temporaryTemper;

    @Column(name = "temporary_resistance")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer temporaryResistance;

    /*RESISTANCES*/
    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_physical")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryPhysical;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_air")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryAir;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_water")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryWater;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_earth")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryEarth;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_fire")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryFire;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_lightning")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryLightning;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_light")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryLight;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_dark")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryDark;

    @Enumerated(EnumType.STRING)
    @Column(name = "temporary_poison")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity temporaryPoison;
}