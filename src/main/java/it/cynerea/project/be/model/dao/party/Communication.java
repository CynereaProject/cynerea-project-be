package it.cynerea.project.be.model.dao.party;

import it.cynerea.project.be.model.dao.party.id.CommunicationId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

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

}