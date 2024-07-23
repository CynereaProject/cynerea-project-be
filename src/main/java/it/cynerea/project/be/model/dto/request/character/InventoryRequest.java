package it.cynerea.project.be.model.dto.request.character;

import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.thing.Thing;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;
import java.util.UUID;

public record InventoryRequest (
    Long thingId,
    UUID characterId
){}