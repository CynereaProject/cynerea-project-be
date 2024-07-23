package it.cynerea.project.be.model.dto.request.chat;

import it.cynerea.project.be.model.dao.chat.id.InfluenceId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record Influence (
    String partyName,
    Integer worth
){}