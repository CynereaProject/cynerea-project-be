package it.cynerea.project.be.model.dao.thing;

import it.cynerea.project.be.model.enums.Manufacture;
import it.cynerea.project.be.model.enums.ThingType;
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
@Table(name = "th_thing")
public class Thing {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "th_thing_seq")
    @SequenceGenerator(name = "th_thing_seq")
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

    @Enumerated(EnumType.STRING)
    @Column(name = "thing_type", nullable = false)
    private ThingType thingType;

    @Lob
    @Column(name = "effect", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String effect;

    @Enumerated(EnumType.STRING)
    @Column(name = "manufacture", nullable = false)
    private Manufacture manufacture;

    @Column(name = "value")
    private Integer value;

    @Column(name = "is_unique", nullable = false)
    private Boolean isUnique = false;

    @Column(name = "is_cumulative", nullable = false)
    private Boolean isCumulative = false;

    @ManyToOne(optional = false)
    @JoinColumn(name = "subtype_name", nullable = false)
    private ThingSubtype subtype;

    @ManyToMany
    @JoinTable(name = "th_thing_attributes",
            joinColumns = @JoinColumn(name = "thing_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_name"))
    private Set<Attribute> attributes = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing thing)) return false;
        return Objects.equals(getId(), thing.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}