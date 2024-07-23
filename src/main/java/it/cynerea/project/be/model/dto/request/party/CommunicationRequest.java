package it.cynerea.project.be.model.dto.request.party;

import it.cynerea.project.be.model.dao.party.id.CommunicationId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;
import java.util.UUID;

public record CommunicationRequest (
    UUID playerId,
    Boolean isPin,
    String text
){}