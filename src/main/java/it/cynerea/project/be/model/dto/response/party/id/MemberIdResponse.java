package it.cynerea.project.be.model.dto.response.party.id;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import it.cynerea.project.be.model.dto.response.party.PartyResponse;

public record MemberIdResponse(
        CharacterResponse character,
        PartyResponse party
) {
}