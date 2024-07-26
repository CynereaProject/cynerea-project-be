package it.cynerea.project.be.model.dao.party.id;

import it.cynerea.project.be.model.dao.character.Character;
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
public class MemberId {
    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(optional = false)
    @JoinColumn(name = "party_name", nullable = false)
    private Party party;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberId memberId)) return false;
        return Objects.equals(getCharacter().getId(), memberId.getCharacter().getId()) && Objects.equals(getParty().getName(), memberId.getParty().getMembers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCharacter().getId(), getParty().getName());
    }
}