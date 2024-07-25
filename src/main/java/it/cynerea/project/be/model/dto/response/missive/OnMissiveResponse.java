package it.cynerea.project.be.model.dto.response.missive;

import java.sql.Date; 
import java.util.UUID;

public record OnMissiveResponse(
        String id,
        CharacterMissiveResponse sender,
        CharacterMissiveResponse recipient,
        Date date,
        String title,
        String text,
        OnMissiveResponse thread
) {
}