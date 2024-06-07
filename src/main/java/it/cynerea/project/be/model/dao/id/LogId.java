package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Character;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Embeddable
public class LogId {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(optional = false)
    @JoinColumn(name = "operator_id", nullable = false)
    private Character operator;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        LogId logId = (LogId) o;
        return getId() != null && Objects.equals(getId(), logId.getId())
                && getCharacter() != null && Objects.equals(getCharacter(), logId.getCharacter())
                && getOperator() != null && Objects.equals(getOperator(), logId.getOperator());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(id, character, operator);
    }
}