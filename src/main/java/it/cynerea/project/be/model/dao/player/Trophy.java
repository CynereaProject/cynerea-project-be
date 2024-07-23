package it.cynerea.project.be.model.dao.player;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "pl_trophy")
public class Trophy {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "img", nullable = false)
    private String img;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trophy trophy)) return false;
        return Objects.equals(getName(), trophy.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}