package it.cynerea.project.be.model.dto.request.order;

import it.cynerea.project.be.model.dao.order.id.OrderSkillId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record OrderSkillRequest (
    Long skillId,
    Integer unlockLevel
){}