package it.cynerea.project.be.model.dao.chat;

import it.cynerea.project.be.model.dao.chat.id.InfluenceId;
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
@Table(name = "cht_influence")
public class Influence {
    @EmbeddedId
    private InfluenceId id;

    @Column(name = "worth", nullable = false)
    private Integer worth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Influence influence)) return false;
        return Objects.equals(getId(), influence.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}