package it.cynerea.project.be.model.dao.master;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "ms_ability")
public class Ability {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ability ability)) return false;
        return Objects.equals(getName(), ability.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}