package it.cynerea.project.be.model.dto.request.action;

import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.embedded.Resistances;
import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dao.skill.Skill;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningSkillRequest;
import it.cynerea.project.be.model.dto.request.common.ResistancesRequest;
import it.cynerea.project.be.model.dto.request.common.StatsRequest;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public record ActionRequest(
    UUID characterId,
    Boolean isReport,
    String text,
    StatsRequest modifierStats,
    ResistancesRequest modifierResistances,
    Set<Long> skillsId
){}