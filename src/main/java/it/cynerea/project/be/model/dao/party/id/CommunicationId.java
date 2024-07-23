package it.cynerea.project.be.model.dao.party.id;

import it.cynerea.project.be.model.dao.party.Party;
import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Embeddable
public class CommunicationId {
    @ManyToOne(optional = false)
    @JoinColumn(name = "party_name", nullable = false)
    private Party party;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Column(name = "date", nullable = false)
    private Instant date;

}