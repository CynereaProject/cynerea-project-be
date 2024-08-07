package it.cynerea.project.be.model.dao.channel;

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
@Table(name = "chn_channel")
public class Channel {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "img", nullable = false)
    private String img;

    @OneToMany(mappedBy = "id.channel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Enablement> enablements = new LinkedHashSet<>();

    @OneToMany(mappedBy = "channel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Message> messages = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel channel)) return false;
        return Objects.equals(getName(), channel.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}