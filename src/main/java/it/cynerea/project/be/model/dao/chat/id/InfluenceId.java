package it.cynerea.project.be.model.dao.chat.id;

import it.cynerea.project.be.model.dao.chat.Chat;
import it.cynerea.project.be.model.dao.party.Party;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfluenceId that)) return false;
        return Objects.equals(getChat().getId(), that.getChat().getId()) && Objects.equals(getParty().getName(), that.getParty().getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChat().getId(), getParty().getName());
    }
}