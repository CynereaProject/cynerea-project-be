package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dto.response.character.id.CharacterSkillIdResponse;


public record CharacterSkillResponse(
        CharacterSkillIdResponse id,
        Integer level
) {
}