package it.cynerea.project.be.model.dao.thing;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "th_attribute")
public class Attribute {
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
        if (!(o instanceof Attribute attribute)) return false;
        return Objects.equals(getName(), attribute.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}