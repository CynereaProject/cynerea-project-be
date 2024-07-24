package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record PlayerIpResponse (
    String playerName,
    String ip
){}