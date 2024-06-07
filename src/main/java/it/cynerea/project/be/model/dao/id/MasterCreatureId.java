package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Character;
import it.cynerea.project.be.model.dao.Creature;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class MasterCreatureId implements Serializable {
    @ManyToOne(optional = false)
    private Character master;

    @ManyToOne(optional = false)
    private Creature creature;

    @Column(name = "custom_name", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String customName;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        MasterCreatureId that = (MasterCreatureId) o;
        return getMaster() != null && Objects.equals(getMaster(), that.getMaster())
                && getCreature() != null && Objects.equals(getCreature(), that.getCreature())
                && getCustomName() != null && Objects.equals(getCustomName(), that.getCustomName());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(master, creature, customName);
    }
}