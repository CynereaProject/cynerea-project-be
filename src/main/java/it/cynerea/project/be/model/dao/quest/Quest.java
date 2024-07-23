package it.cynerea.project.be.model.dao.quest;

import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.master.MasterMonster;
import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "qst_quest")
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "master_id", nullable = false)
    private Player master;

    @OneToMany(mappedBy = "quest", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MasterMonster> monsters = new LinkedHashSet<>();

    @Column(name = "open_date", nullable = false)
    private Instant openDate;

    @Column(name = "close_date")
    private Instant closeDate;

    @Column(name = "is_lock", nullable = false)
    private Boolean isLock = false;

    @ManyToMany
    @JoinTable(name = "qst_quest_participants",
            joinColumns = @JoinColumn(name = "quest_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id"))
    private Set<Character> participants = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "qst_quest_actions",
            joinColumns = @JoinColumn(name = "quest_id"),
            inverseJoinColumns = @JoinColumn(name = "action_id"))
    private Set<Action> actions = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quest quest)) return false;
        return Objects.equals(getId(), quest.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}