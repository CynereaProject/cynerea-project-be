package it.cynerea.project.be.model.dto.response.missive;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

public record OffGroupMissiveResponse(
        String id,
        PlayerMissiveResponse sender,
        Timestamp date,
        String title,
        String text,
        Set<OffGroupDiscussionResponse> discussions,
        Set<OffGroupReplyResponse> replies
) {
}