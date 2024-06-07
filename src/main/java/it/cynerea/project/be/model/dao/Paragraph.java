package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.dao.Chapter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "paragraph")
public class Paragraph {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer id;

    @Column(name = "title", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String title;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "chapter_id", nullable = false)
    private Chapter chapter;

    @OneToMany(mappedBy = "paragraph", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Section> sections = new LinkedHashSet<>();

}