package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.enums.Merit;
import it.cynerea.project.be.model.enums.ItemTypology;
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
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "typology", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private ItemTypology typology;

    @Lob
    @Column(name = "effect")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String effect;

    @Enumerated(EnumType.STRING)
    @Column(name = "merit", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Merit merit;

    @Column(name = "value")
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer value;

    @Column(name = "is_cumulative", nullable = false)
    private Boolean isCumulative = false;

    @Column(name = "is_unique", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isUnique = false;

    @ManyToMany
    @JoinTable(name = "item_attribute",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    private Set<Attribute> attributes = new LinkedHashSet<>();

}