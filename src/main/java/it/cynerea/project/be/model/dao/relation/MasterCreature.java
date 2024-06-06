package it.cynerea.project.be.model.dao.relation;

import it.cynerea.project.be.model.dao.id.MasterCreatureId;
import it.cynerea.project.be.model.enums.Affinity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@Table(name = "master_creature")
public class MasterCreature {
    @EmbeddedId
    private MasterCreatureId id;

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
    @Column(name = "actual_life")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer actualLife;

    @Column(name = "actual_mana")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer actualMana;

    @Column(name = "dodge_modifier")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer dodgeModifier;

    @Column(name = "temper_modifier")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer temperModifier;

    @Column(name = "resistance_")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer resistanceModifier;

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