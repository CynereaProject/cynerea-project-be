package it.cynerea.project.be.model.dto.request.race;

import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dao.skill.Skill;
import it.cynerea.project.be.model.dto.request.common.StatsRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record RaceRequest (
    String name,
    String description,
    String img,
    StatsRequest stats,
    Long nextStepId
){}