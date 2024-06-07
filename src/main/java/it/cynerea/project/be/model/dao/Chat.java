package it.cynerea.project.be.model.dao;

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
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "img", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private URL img;

    @Column(name = "group_influence_1", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer groupInfluence1;

    @Column(name = "group_influence_2", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer groupInfluence2;

    @Column(name = "group_influence_3", nullable = false)
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer groupInfluence3;

    @Lob
    @Column(name = "master_notes", nullable = false)
    private String masterNotes;

    @OneToMany(mappedBy = "chat", orphanRemoval = true)
    private Set<Character> characters = new LinkedHashSet<>();

}