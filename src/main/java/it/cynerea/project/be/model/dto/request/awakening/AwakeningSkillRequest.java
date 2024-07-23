package it.cynerea.project.be.model.dto.request.awakening;

import it.cynerea.project.be.model.dao.awakening.id.AwakeningSkillId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record AwakeningSkillRequest (
    Long skillId,
    Integer awakeningDegreeRequest
){}