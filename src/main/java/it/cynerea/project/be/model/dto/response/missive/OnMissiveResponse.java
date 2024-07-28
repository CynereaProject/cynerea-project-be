package it.cynerea.project.be.model.dto.response.missive;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;

import java.sql.Timestamp;


public record OnMissiveResponse(
        String id,
        CharacterResponse sender,
        CharacterResponse recipient,
        Timestamp date,
        String title,
        String text,
        Boolean isRead,
        OnMissiveResponse thread
) {
}