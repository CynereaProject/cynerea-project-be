package it.cynerea.project.be.model.dao.missive;

import it.cynerea.project.be.model.dao.character.Character;
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
@Table(name = "msv_on_missive")
public class OnMissive {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private Character sender;

    @ManyToOne(optional = false)
    @JoinColumn(name = "recipient_id", nullable = false)
    private Character recipient;

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
    private OnMissive thread;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnMissive onMissive)) return false;
        return Objects.equals(getId(), onMissive.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}