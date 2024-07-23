package it.cynerea.project.be.model.dto.request.channel;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;


public record MessageRequest (
    Boolean isPin,
    UUID playerId,
    String text
){}