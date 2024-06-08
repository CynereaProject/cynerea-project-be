package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.dao.relation.CharacterItem;
import it.cynerea.project.be.model.dao.relation.CharacterOrder;
import it.cynerea.project.be.model.dao.relation.CharacterSkill;
import it.cynerea.project.be.model.dao.relation.MasterCreature;
import it.cynerea.project.be.model.enums.Affinity;
import it.cynerea.project.be.model.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.net.URL;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "`character`")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String email;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Column(name = "surname", length = 50)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String surname;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Gender gender;

    /*PRIMARY STATS*/
    @Column(name = "strength", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer strength;

    @Column(name = "dexterity", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer dexterity;

    @Column(name = "insight", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer insight;

    @Column(name = "mind", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer mind;

    @Column(name = "presence", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer presence;

    /*SECONDARY STATS*/
    @Column(name = "max_life", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer maxLife;

    @Column(name = "actual_life", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer actualLife;

    @Column(name = "max_mana", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer maxMana;

    @Column(name = "actual_mana", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer actualMana;

    @Column(name = "dodge", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer dodge;

    @Column(name = "temper", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer temper;

    @Column(name = "resistance", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer resistance;

    /*OTHER*/
    @Column(name = "level", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer level = 1;

    @Column(name = "experience", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long experience = 0L;

    @Column(name = "coins", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long coins = 100L;

    @Column(name = "prestige")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Long prestige = 0L;

    /*NOTE*/
    @Column(name = "avatar")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String avatar;

    @Lob
    @Column(name = "description")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Lob
    @Column(name = "master_notes")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String masterNotes;

    @Lob
    @Column(name = "guide_notes")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String guideNotes;

    @Temporal(TemporalType.DATE)
    @Column(name = "registration_date", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private Date registrationDate =  new Date();

    @Temporal(TemporalType.TIME)
    @Column(name = "last_access")
    @JdbcTypeCode(SqlTypes.TIME)
    private Date lastAccess;

    @Temporal(TemporalType.DATE)
    @Column(name = "character_change")
    @JdbcTypeCode(SqlTypes.DATE)
    private Date characterChange =  new Date();


    /*RESISTANCES*/
    @Enumerated(EnumType.STRING)
    @Column(name = "physical", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity physical = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "air", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity air = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "water", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity water = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "earth", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity earth = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "fire", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity fire = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "lightning", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity lightning = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "light", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity light = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "dark", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity dark = Affinity.Neutrale;

    @Enumerated(EnumType.STRING)
    @Column(name = "poison", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Affinity poison = Affinity.Neutrale;

    /*OFF INFO*/
    @Column(name = "is_frozen", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isFrozen = false;

    @Column(name = "is_ban", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isBan = false;

    @Column(name = "ban_note")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String banNote;

    @Column(name = "is_training", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isTraining = false;


    /*FOREIGN KEY*/

    @ToString.Exclude
    @ManyToOne(optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @Column(name = "race_mastery", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean raceMastery = false;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "awakening")
    private Awakening awakening;

    @Column(name = "awakening_grade")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer awakeningGrade;

    @ManyToOne(optional = false)
    @JoinColumn(name = "trait_id")
    private Trait trait;

    @ManyToOne(optional = false)
    @JoinColumn(name = "talent_id")
    private Talent talent;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    /*EQUIPMENT*/
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "left_hand_id", unique = true)
    @ToString.Exclude
    private CharacterItem leftHand;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "right_hand_id", unique = true)
    @ToString.Exclude
    private CharacterItem rightHand;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "body_id", unique = true)
    @ToString.Exclude
    private CharacterItem body;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "accessory1_id", unique = true)
    @ToString.Exclude
    private CharacterItem accessory1;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "accessory2_id", unique = true)
    @ToString.Exclude
    private CharacterItem accessory2;




    /*SETTS*/
    @OneToMany(mappedBy = "id.character", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<CharacterSkill> skills = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.character", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<CharacterOrder> orders = new LinkedHashSet<>();

    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CharacterItem> inventory = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "character_role",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new LinkedHashSet<>();


    @OneToMany(mappedBy = "id.character", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Log> logs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.operator", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Log> operationLogs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Missive> sentMissives = new LinkedHashSet<>();

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Missive> receiveMissives = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.master", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MasterCreature> masterCreatures = new LinkedHashSet<>();

}
