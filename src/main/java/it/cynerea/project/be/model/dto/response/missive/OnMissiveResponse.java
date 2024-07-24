package it.cynerea.project.be.model.dto.response.missive;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public record OnMissiveResponse (
    UUID id,
    CharacterMissiveResponse sender,
    CharacterMissiveResponse recipient,
    Instant date,
    String title,
    String text,
    OnMissiveResponse thread
){}