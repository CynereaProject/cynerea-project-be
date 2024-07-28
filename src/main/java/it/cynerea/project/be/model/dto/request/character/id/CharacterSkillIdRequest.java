package it.cynerea.project.be.model.dto.request.character.id;

public record CharacterSkillIdRequest(
        //CharacterDto character, //OBTAIN TO TOKEN
        Long skillId //CUSTOM MAPPER LONG_TO_SKILL
) {
}