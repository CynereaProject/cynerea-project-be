package it.cynerea.project.be.model.dao.skill;

import it.cynerea.project.be.model.enums.SkillType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "sk_skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sk_skill_seq")
    @SequenceGenerator(name = "sk_skill_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Lob
    @Column(name = "effect", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String effect;

    @Column(name = "img", nullable = false)
    private String img;

    @Column(name = "max_level", nullable = false)
    private Integer maxLevel;

    @Column(name = "mana_cost")
    private Integer manaCost;

    @Column(name = "health_cost")
    private Integer healthCost;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private SkillType type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skill skill)) return false;
        return Objects.equals(getId(), skill.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}