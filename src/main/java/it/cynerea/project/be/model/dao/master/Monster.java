package it.cynerea.project.be.model.dao.master;

import it.cynerea.project.be.model.dao.embedded.Resistances;
import it.cynerea.project.be.model.dao.embedded.Stats;
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
@Table(name = "ms_monster")
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ms_monster_seq")
    @SequenceGenerator(name = "ms_monster_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "specie_name", nullable = false)
    private Specie specie;

    @Column(name = "img", nullable = false)
    private String img;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rank_name", nullable = false)
    private Rank rank;

    @Embedded
    private Stats stats;

    @Column(name = "is_hide", nullable = false)
    private Boolean isHide = false;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Embedded
    private Resistances resistances;

    @ManyToMany
    @JoinTable(name = "ms_monster_abilities",
            joinColumns = @JoinColumn(name = "monster_id"),
            inverseJoinColumns = @JoinColumn(name = "ability_name"))
    private Set<Ability> abilities = new LinkedHashSet<>();

}