package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.dao.relation.AwakeningSkill;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "awakening")
public class Awakening {
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

    @Column(name = "img", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private URL img;

    @OneToMany(mappedBy = "id.awakening", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AwakeningSkill> skills = new LinkedHashSet<>();

}