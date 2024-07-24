package it.cynerea.project.be.model.dto.response.skill;

import it.cynerea.project.be.model.enums.SkillType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

public record SkillResponse (
    Long id,
    String name,
    String effect,
    String img,
    Integer maxLevel,
    Integer manaCost,
    Integer healthCost,
    SkillType type
){}