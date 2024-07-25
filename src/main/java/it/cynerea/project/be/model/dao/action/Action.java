package it.cynerea.project.be.model.dao.action;

import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.embedded.Resistances;
import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dao.skill.Skill;
import it.cynerea.project.be.model.enums.ActionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ac_action")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ActionType type;

    @Lob
    @Column(name = "text", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String text;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "strength", column = @Column(name = "modifier_strength")),
            @AttributeOverride(name = "dexterity", column = @Column(name = "modifier_dexterity")),
            @AttributeOverride(name = "insight", column = @Column(name = "modifier_insight")),
            @AttributeOverride(name = "constitution", column = @Column(name = "modifier_constitution")),
            @AttributeOverride(name = "willpower", column = @Column(name = "modifier_willpower")),
            @AttributeOverride(name = "charisma", column = @Column(name = "modifier_charisma")),
            @AttributeOverride(name = "health", column = @Column(name = "modifier_health")),
            @AttributeOverride(name = "mana", column = @Column(name = "modifier_mana")),
            @AttributeOverride(name = "dodge", column = @Column(name = "modifier_dodge")),
            @AttributeOverride(name = "temper", column = @Column(name = "modifier_temper")),
            @AttributeOverride(name = "resistance", column = @Column(name = "modifier_resistance"))
    })
    private Stats modifierStats;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "physics", column = @Column(name = "modifier_physics")),
            @AttributeOverride(name = "air", column = @Column(name = "modifier_air")),
            @AttributeOverride(name = "water", column = @Column(name = "modifier_water")),
            @AttributeOverride(name = "earth", column = @Column(name = "modifier_earth")),
            @AttributeOverride(name = "fire", column = @Column(name = "modifier_fire")),
            @AttributeOverride(name = "bolt", column = @Column(name = "modifier_bolt")),
            @AttributeOverride(name = "light", column = @Column(name = "modifier_light")),
            @AttributeOverride(name = "dark", column = @Column(name = "modifier_dark")),
            @AttributeOverride(name = "poison", column = @Column(name = "modifier_poison"))
    })
    private Resistances modifierResistances;

    @ManyToMany
    @JoinTable(name = "ac_action_skills",
            joinColumns = @JoinColumn(name = "action_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action action)) return false;
        return Objects.equals(getId(), action.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}