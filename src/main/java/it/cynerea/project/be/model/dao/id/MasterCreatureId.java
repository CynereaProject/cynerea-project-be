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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MasterCreatureId entity = (MasterCreatureId) o;
        return Objects.equals(this.customName, entity.customName) &&
                Objects.equals(this.creature, entity.creature) &&
                Objects.equals(this.master, entity.master);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customName, creature, master);
    }

}