package it.cynerea.project.be.model.dao.id;

import it.cynerea.project.be.model.dao.Race;
import it.cynerea.project.be.model.dao.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class RaceSkillId implements Serializable {
    @ManyToOne(optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        RaceSkillId that = (RaceSkillId) o;
        return getRace() != null && Objects.equals(getRace(), that.getRace())
                && getSkill() != null && Objects.equals(getSkill(), that.getSkill());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(race, skill);
    }
}