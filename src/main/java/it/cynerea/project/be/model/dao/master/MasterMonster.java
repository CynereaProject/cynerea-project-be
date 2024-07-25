package it.cynerea.project.be.model.dao.master;

import it.cynerea.project.be.model.dao.embedded.Resistances;
import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.quest.Quest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ms_master_monster")
public class MasterMonster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "monster_id", nullable = false)
    private Monster monster;

    @ManyToOne(optional = false)
    @JoinColumn(name = "master_id", nullable = false)
    private Player master;

    @Column(name = "custom_name", unique = true)
    private String customName;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "strength", column = @Column(name = "current_strength")),
            @AttributeOverride(name = "dexterity", column = @Column(name = "current_dexterity")),
            @AttributeOverride(name = "insight", column = @Column(name = "current_insight")),
            @AttributeOverride(name = "constitution", column = @Column(name = "current_constitution")),
            @AttributeOverride(name = "willpower", column = @Column(name = "current_willpower")),
            @AttributeOverride(name = "charisma", column = @Column(name = "current_charisma")),
            @AttributeOverride(name = "health", column = @Column(name = "current_health")),
            @AttributeOverride(name = "mana", column = @Column(name = "current_mana")),
            @AttributeOverride(name = "dodge", column = @Column(name = "current_dodge")),
            @AttributeOverride(name = "temper", column = @Column(name = "current_temper")),
            @AttributeOverride(name = "resistance", column = @Column(name = "current_resistance"))
    })
    private Stats currentStats;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "physics", column = @Column(name = "current_physics")),
            @AttributeOverride(name = "air", column = @Column(name = "current_air")),
            @AttributeOverride(name = "water", column = @Column(name = "current_water")),
            @AttributeOverride(name = "earth", column = @Column(name = "current_earth")),
            @AttributeOverride(name = "fire", column = @Column(name = "current_fire")),
            @AttributeOverride(name = "bolt", column = @Column(name = "current_bolt")),
            @AttributeOverride(name = "light", column = @Column(name = "current_light")),
            @AttributeOverride(name = "dark", column = @Column(name = "current_dark")),
            @AttributeOverride(name = "poison", column = @Column(name = "current_poison"))
    })
    private Resistances currentResistances;

    @ManyToOne(optional = false)
    @JoinColumn(name = "quest_id")
    private Quest quest;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MasterMonster that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}