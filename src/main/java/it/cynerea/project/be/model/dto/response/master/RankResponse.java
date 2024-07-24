package it.cynerea.project.be.model.dto.response.master;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record RankResponse (
    String name,
    String description
){}