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
@Table(name = "`group`")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.SMALLINT)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Lob
    @Column(name = "statute", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String statute;

    @Column(name = "img", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private URL img;

    @Column(name = "cash")
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long cash;

    @Column(name = "is_off", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isOff = false;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Role> roles = new LinkedHashSet<>();

}