package it.cynerea.project.be.model.dao.channel;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ch_message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, length = 36)
    private UUID id;

    @Column(name = "send_date", nullable = false)
    private Instant sendDate;

    @Column(name = "is_pin", nullable = false)
    private Boolean isPin = false;

    @ManyToOne(optional = false)
    @JoinColumn(name = "channel_name", nullable = false)
    private Channel channel;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message message)) return false;
        return Objects.equals(getId(), message.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}