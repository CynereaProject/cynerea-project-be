package it.cynerea.project.be.model.dto.request.system;

import it.cynerea.project.be.model.dao.system.id.CharacterLogId;
import it.cynerea.project.be.model.enums.CharacterLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

public record CharacterLogRequest (
    UUID characterId,
    String cause,
    CharacterLogType type
){}