package it.cynerea.project.be.model.dao.master;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ms_specie")
public class Specie {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @OneToMany(mappedBy = "specie")
    private Set<Monster> monsters = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specie specie)) return false;
        return Objects.equals(getName(), specie.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}