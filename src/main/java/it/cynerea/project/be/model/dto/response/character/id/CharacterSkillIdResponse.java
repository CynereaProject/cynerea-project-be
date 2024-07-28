package it.cynerea.project.be.model.dto.response.character.id;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import it.cynerea.project.be.model.dto.response.skill.SkillResponse;

public record CharacterSkillIdResponse(
        CharacterResponse character,
        SkillResponse skill
) {
}