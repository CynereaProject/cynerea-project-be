package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Capacity;
import it.cynerea.project.be.model.dao.Creature;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CreatureCapacityId implements Serializable {
    @ManyToOne(optional = false)
    private Creature creature;

    @ManyToOne(optional = false)
    private Capacity capacity;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        CreatureCapacityId that = (CreatureCapacityId) o;
        return getCreature() != null && Objects.equals(getCreature(), that.getCreature())
                && getCapacity() != null && Objects.equals(getCapacity(), that.getCapacity());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(creature, capacity);
    }
}