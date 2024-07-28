package it.cynerea.project.be.model.dto.request.character;

public record CharacterSkillRequest(
        //CharacterDto character, //OBTAIN TO TOKEN
        Long skillId //CUSTOM MAPPER LONG_TO_SKILL
        //Integer level INCREMENT
) {
}