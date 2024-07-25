package it.cynerea.project.be.model.dao.character;

import it.cynerea.project.be.model.dao.awakening.Awakening;
import it.cynerea.project.be.model.dao.embedded.Blessing;
import it.cynerea.project.be.model.dao.embedded.Equipment;
import it.cynerea.project.be.model.dao.embedded.Resistances;
import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dao.missive.OnMissive;
import it.cynerea.project.be.model.dao.party.Member;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.race.Race;
import it.cynerea.project.be.model.dao.system.CharacterLog;
import it.cynerea.project.be.model.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date; 
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ch_character")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "title")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Column(name = "experience", nullable = false)
    private Long experience;

    @Column(name = "coin", nullable = false)
    private Long coin;

    @Column(name = "prestige", nullable = false)
    private Integer prestige;

    @Column(name = "avatar", nullable = false)
    private String avatar;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONG32NVARCHAR)
    private String description;

    @Lob
    @Column(name = "master_note")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String masterNote;

    @Lob
    @Column(name = "guide_note")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String guideNote;

    @Lob
    @Column(name = "rumors")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String rumors;

    @Column(name = "creation_date", nullable = false)
    private Date creationDate;

    @Column(name = "last_action_date")
    private Date lastActionDate;

    @Column(name = "is_frozen", nullable = false)
    private Boolean isFrozen = false;

    @Embedded
    private Stats stats;

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
    private Resistances resistances;

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

    @Embedded
    private Equipment equipment;

    @OneToMany(mappedBy = "id.character", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CharacterLog> log = new LinkedHashSet<>();

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Inventory> inventory = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.character", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Member> memberOf = new LinkedHashSet<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "awakening_id", nullable = false)
    private Awakening awakening;

    @Column(name = "awakening_degree", nullable = false)
    private Integer awakeningDegree;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Embedded
    private Blessing blessing;

    @ManyToOne
    @JoinColumn(name = "trait_id")
    private Trait trait;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OnMissive> missivesSend = new LinkedHashSet<>();

    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OnMissive> missivesReceive = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.character", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CharacterOrder> characterOrders = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.character", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CharacterSkill> skills = new LinkedHashSet<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character character)) return false;
        return Objects.equals(getId(), character.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}