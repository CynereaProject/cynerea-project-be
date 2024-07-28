package it.cynerea.project.be.model.dto.request.character;

import it.cynerea.project.be.model.dto.request.character.id.CharacterSkillIdRequest;


public record CharacterSkillRequest(
        CharacterSkillIdRequest id
        //Integer level INCREMENT
) {
}