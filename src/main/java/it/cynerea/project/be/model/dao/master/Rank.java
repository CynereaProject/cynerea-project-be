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
@Table(name = "ms_rank")
public class Rank {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @OneToMany(mappedBy = "rank")
    private Set<Monster> monsters = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rank rank)) return false;
        return Objects.equals(getName(), rank.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}