package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.id.ManagementLogId;
import it.cynerea.project.be.model.enums.ManagementLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Objects;

public record ManagementLogResponse (
        PlayerLogResponse player,
        String resource,
        Timestamp date,
        String cause,
        ManagementLogType type
){}