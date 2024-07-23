package it.cynerea.project.be.model.dao.party;

import it.cynerea.project.be.model.dao.player.Player;
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
@Table(name = "pt_board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "party_name", nullable = false)
    private Party party;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "text", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String text;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Discussion> discussion = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board board)) return false;
        return Objects.equals(getId(), board.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}