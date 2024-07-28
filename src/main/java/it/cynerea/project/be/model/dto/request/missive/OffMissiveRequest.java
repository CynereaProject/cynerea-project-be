package it.cynerea.project.be.model.dto.request.missive;

public record OffMissiveRequest(
        //String id, GENERATE
        //PlayerRequest sender, OBTAIN BY TOKEN
        String recipientId, //CUSTOM MAPPER STRING_TO_PLAYER
        //Timestamp date, GENERATE
        String title,
        String text,
        //Boolean isRead, FALSE
        String threadId //CUSTOM MAPPER STRING_TO_OFFMISSIVE
) {
}