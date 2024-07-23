package it.cynerea.project.be.model.dao.character;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "ch_trait")
public class Trait {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ch_trait_seq")
    @SequenceGenerator(name = "ch_trait_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Lob
    @Column(name = "effect", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String effect;

    @Column(name = "requirements")
    private String requirements;

    @Column(name = "img", nullable = false)
    private String img;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trait trait)) return false;
        return Objects.equals(getId(), trait.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}