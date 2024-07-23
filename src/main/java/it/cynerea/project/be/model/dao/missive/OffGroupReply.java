package it.cynerea.project.be.model.dao.missive;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "msv_off_group_reply")
public class OffGroupReply {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "off_group_missive_id", nullable = false)
    private OffGroupMissive offGroupMissive;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private Player sender;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "text", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String text;

    @OneToOne
    @JoinColumn(name = "thread_id")
    private OffGroupReply thread;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OffGroupReply that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}