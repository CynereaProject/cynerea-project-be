package it.cynerea.project.be.model.dto.request.player;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

public record TrophyRequest (
    String description,
    String img
){}