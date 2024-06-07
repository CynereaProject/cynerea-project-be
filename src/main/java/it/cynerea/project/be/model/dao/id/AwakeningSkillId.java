package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Awakening;
import it.cynerea.project.be.model.dao.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class AwakeningSkillId implements Serializable {

    @ManyToOne(optional = false)
    private Awakening awakening;

    @OneToOne(optional = false, orphanRemoval = true)
    private Skill skill;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        AwakeningSkillId that = (AwakeningSkillId) o;
        return getAwakening() != null && Objects.equals(getAwakening(), that.getAwakening())
                && getSkill() != null && Objects.equals(getSkill(), that.getSkill());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(awakening, skill);
    }
}