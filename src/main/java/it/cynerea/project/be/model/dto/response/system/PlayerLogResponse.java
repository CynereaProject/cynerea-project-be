package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.enums.PlayerLogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Objects;

public record PlayerLogResponse (
        LogPlayerResponse player,
        LogPlayerResponse target,
        Instant date,
        String cause,
        PlayerLogType type
){}