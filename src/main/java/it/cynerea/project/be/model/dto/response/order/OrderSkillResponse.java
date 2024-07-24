package it.cynerea.project.be.model.dto.response.order;

import it.cynerea.project.be.model.dao.skill.Skill;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record OrderSkillResponse (
    Skill skill,
    Integer unlockLevel
){}