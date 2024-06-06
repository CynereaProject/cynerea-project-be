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
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Column(name = "img", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private URL img;

    @Column(name = "is_manager", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isManager = false;

    @ManyToMany(mappedBy = "roles")
    private Set<Character> members = new LinkedHashSet<>();

}