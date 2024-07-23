package it.cynerea.project.be.model.dao.player;

import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.chat.Chat;
import it.cynerea.project.be.model.dao.master.Drop;
import it.cynerea.project.be.model.dao.master.MasterMonster;
import it.cynerea.project.be.model.dao.missive.OffGroupMissive;
import it.cynerea.project.be.model.dao.missive.OffMissive;
import it.cynerea.project.be.model.dao.quest.Quest;
import it.cynerea.project.be.model.dao.system.CharacterLog;
import it.cynerea.project.be.model.dao.system.PlayerIp;
import it.cynerea.project.be.model.dao.system.PlayerLog;
import it.cynerea.project.be.model.enums.Gender;
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
@Table(name = "pl_player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, length = 36)
    private UUID id;

    @Column(name = "username", nullable = false, unique = true, length = 30)
    private String username;

    @Column(name = "name", unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "registration_date", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private Instant registrationDate;

    @Column(name = "last_login_date")
    private Instant lastLoginDate;

    /*LIMIT ACCOUNT*/
    @Column(name = "is_ban", nullable = false)
    private Boolean isBan = false;

    @Column(name = "ban_end_date", nullable = false)
    private Instant banEndDate;

    @Column(name = "is_training", nullable = false)
    private Boolean isTraining = false;

    @Column(name = "is_silenced", nullable = false)
    private Boolean isSilenced = false;

    @ManyToMany
    @JoinTable(name = "pl_player_roles",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "role_name"))
    private Set<Role> roles = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "pl_player_trophies",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "trophy_name"))
    private Set<Trophy> trophies = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.player", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlayerIp> ips = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.player", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlayerLog> playerLogs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.player", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CharacterLog> characterLogs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "master", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MasterMonster> monsters = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.master", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Drop> drops = new LinkedHashSet<>();

    @OneToMany(mappedBy = "master", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, orphanRemoval = true)
    private Set<Quest> quests = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Character> characters = new LinkedHashSet<>();

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OffGroupMissive> groupMissivesSend = new LinkedHashSet<>();

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OffMissive> missivesSend = new LinkedHashSet<>();

    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OffMissive> missivesReceive = new LinkedHashSet<>();

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "character_in_use_id")
    private Character characterInUse;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return Objects.equals(getId(), player.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}