package it.cynerea.project.be.model.dao.awakening;

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
@Table(name = "aw_awakening")
public class Awakening {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aw_awakening_seq")
    @SequenceGenerator(name = "aw_awakening_seq")
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

    @OneToMany(mappedBy = "id.awakening", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AwakeningSkill> skills = new LinkedHashSet<>();

}