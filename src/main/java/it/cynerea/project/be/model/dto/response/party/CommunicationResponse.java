package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.util.Objects;


public record CommunicationResponse (
    PartyPlayerResponse player,
    Instant date,
    Boolean isPin,
    String text
){}