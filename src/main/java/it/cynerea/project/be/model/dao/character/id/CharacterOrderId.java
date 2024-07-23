package it.cynerea.project.be.model.dao.character.id;

import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.order.Order;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CharacterOrderId {
    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharacterOrderId that)) return false;
        return Objects.equals(getCharacter().getId(), that.getCharacter().getId()) && Objects.equals(getOrder().getId(), that.getOrder().getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCharacter().getId(), getOrder().getId());
    }
}