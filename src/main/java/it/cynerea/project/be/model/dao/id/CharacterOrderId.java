package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Character;
import it.cynerea.project.be.model.dao.Order;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CharacterOrderId implements Serializable {
    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        CharacterOrderId that = (CharacterOrderId) o;
        return getCharacter() != null && Objects.equals(getCharacter(), that.getCharacter())
                && getOrder() != null && Objects.equals(getOrder(), that.getOrder());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(character, order);
    }
}