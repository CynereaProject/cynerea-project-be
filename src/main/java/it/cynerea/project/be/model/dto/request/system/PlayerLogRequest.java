package it.cynerea.project.be.model.dto.request.system;

import it.cynerea.project.be.model.dao.system.id.PlayerLogId;
import it.cynerea.project.be.model.enums.PlayerLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

public record PlayerLogRequest (
    UUID targetId,
    String cause,
    PlayerLogType type
){}