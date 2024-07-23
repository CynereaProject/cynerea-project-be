package it.cynerea.project.be.model.dto.request.character;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

public record TraitRequest (
    String name,
    String description,
    String effect,
    String requirements,
    String img
){}