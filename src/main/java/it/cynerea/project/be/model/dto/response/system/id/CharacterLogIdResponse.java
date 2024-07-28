package it.cynerea.project.be.model.dto.response.system.id;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;

public record CharacterLogIdResponse(
        PlayerResponse player,
        CharacterResponse character,
        Timestamp date
) {
}