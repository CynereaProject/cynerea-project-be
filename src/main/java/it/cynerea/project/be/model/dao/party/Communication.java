package it.cynerea.project.be.model.dao.party;

import it.cynerea.project.be.model.dao.party.id.CommunicationId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "pt_communication")
public class Communication {
    @EmbeddedId
    private CommunicationId id;

    @Column(name = "is_pin", nullable = false)
    private Boolean isPin = false;

    @Lob
    @Column(name = "text", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Communication that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}