package it.cynerea.project.be.model.dao.chat.id;

import it.cynerea.project.be.model.dao.chat.Chat;
import it.cynerea.project.be.model.dao.party.Party;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class InfluenceId {

    @ManyToOne(optional = false)
    @JoinColumn(name = "chat_id", nullable = false)
    private Chat chat;

    @ManyToOne(optional = false)
    @JoinColumn(name = "party_name", nullable = false)
    private Party party;
}