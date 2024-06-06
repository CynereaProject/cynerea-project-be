package it.cynerea.project.be.model.dao;

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
@Table(name = "ip_address")
public class IpAddress {

    @Id
    @Column(name = "ip", nullable = false, length = 15)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String ip;

    @Column(name = "is_ban", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isBan = false;

    @ManyToMany
    @JoinTable(name = "ip_character",
            joinColumns = @JoinColumn(name = "ipAddress"),
            inverseJoinColumns = @JoinColumn(name = "character"))
    private Set<Character> characterList = new LinkedHashSet<>();

}