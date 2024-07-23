package it.cynerea.project.be.model.dao.player;

import it.cynerea.project.be.model.dao.channel.Enablement;
import it.cynerea.project.be.model.dao.missive.OffGroupMissive;
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
@Table(name = "pl_group")
public class Group {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "img", nullable = false)
    private String img;

    @Column(name = "is_hide", nullable = false)
    private Boolean isHide = false;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Role> roles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.group", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Enablement> enablements = new LinkedHashSet<>();

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OffGroupMissive> missivesReceive = new LinkedHashSet<>();

}