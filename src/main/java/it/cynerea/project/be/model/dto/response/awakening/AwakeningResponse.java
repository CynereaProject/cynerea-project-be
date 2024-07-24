package it.cynerea.project.be.model.dto.response.awakening;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record AwakeningResponse (
    Long id,
    String name,
    String description,
    String img,
    Set<AwakeningSkillResponse> skills
){}