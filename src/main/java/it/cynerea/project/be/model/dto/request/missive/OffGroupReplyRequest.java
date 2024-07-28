package it.cynerea.project.be.model.dto.request.missive;

public record OffGroupReplyRequest(
        //String id, GENERATE
        String offGroupMissiveId, //CUSTOM MAPPER STRING_TO_OFFGROUPMISSIVE
        //PlayerRequest sender, OBTAIN BY TOKEN
        //Timestamp date, GENERATE
        String title,
        String text,
        //Boolean isRead, FALSE
        String threadId //CUSTOM MAPPER STRING_TO_OFFGROUPREPLY
) {
}