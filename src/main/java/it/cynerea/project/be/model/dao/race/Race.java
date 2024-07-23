package it.cynerea.project.be.model.dao.race;

import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dao.skill.Skill;
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
@Table(name = "rc_race")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rc_race_seq")
    @SequenceGenerator(name = "rc_race_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "img", nullable = false)
    private String img;

    @Embedded
    private Stats stats;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "next_step_id", unique = true)
    private Race nextStep;

    @ManyToMany
    @JoinTable(name = "rc_race_skills",
            joinColumns = @JoinColumn(name = "race_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Race race)) return false;
        return Objects.equals(getId(), race.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}