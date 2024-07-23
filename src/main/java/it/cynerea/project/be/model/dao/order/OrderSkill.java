package it.cynerea.project.be.model.dao.order;

import it.cynerea.project.be.model.dao.order.id.OrderSkillId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "or_order_skill")
public class OrderSkill {
    @EmbeddedId
    private OrderSkillId id;

    @Column(name = "unlock_level", nullable = false)
    private Integer unlockLevel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderSkill that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}