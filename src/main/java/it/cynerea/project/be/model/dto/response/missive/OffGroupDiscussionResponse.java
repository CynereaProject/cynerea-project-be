package it.cynerea.project.be.model.dto.response.missive;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

public record OffGroupDiscussionResponse(
        String id,
        PlayerMissiveResponse sender,
        Timestamp date,
        String text
) {
}