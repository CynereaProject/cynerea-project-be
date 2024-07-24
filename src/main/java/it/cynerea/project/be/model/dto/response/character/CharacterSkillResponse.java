package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dao.skill.Skill;
import it.cynerea.project.be.model.dto.response.skill.SkillResponse;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record CharacterSkillResponse (
    SkillResponse skill,
    Integer level
){}