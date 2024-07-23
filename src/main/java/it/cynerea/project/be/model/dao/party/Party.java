package it.cynerea.project.be.model.dao.party;

import it.cynerea.project.be.model.dao.chat.Influence;
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
@Table(name = "pt_party")
public class Party {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "img", nullable = false)
    private String img;

    @Column(name = "is_guild", nullable = false)
    private Boolean isGuild = false;

    @Column(name = "coin", nullable = false)
    private Long coin;

    @OneToMany(mappedBy = "id.party", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Influence> influences = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.party", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Communication> communications = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.party", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Member> members = new LinkedHashSet<>();

    @OneToMany(mappedBy = "party", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Board> boards = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Party party)) return false;
        return Objects.equals(getName(), party.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}