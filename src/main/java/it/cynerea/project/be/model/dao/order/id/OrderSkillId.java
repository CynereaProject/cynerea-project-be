package it.cynerea.project.be.model.dao.order.id;

import it.cynerea.project.be.model.dao.order.Order;
import it.cynerea.project.be.model.dao.skill.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class OrderSkillId {

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(optional = false)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderSkillId that)) return false;
        return Objects.equals(getOrder().getId(), that.getOrder().getId()) && Objects.equals(getSkill().getId(), that.getSkill().getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrder().getId(), getSkill().getId());
    }
}