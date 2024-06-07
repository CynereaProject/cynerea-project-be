package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.dao.id.RaceSkillId;
import it.cynerea.project.be.model.dao.relation.RaceSkill;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "race")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "img")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private URL img;


    @OneToMany(mappedBy = "id.race", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<RaceSkill> raceSkills = new LinkedHashSet<>();

}
