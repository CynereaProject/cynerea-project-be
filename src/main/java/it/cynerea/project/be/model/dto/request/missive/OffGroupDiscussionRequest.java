package it.cynerea.project.be.model.dto.request.missive;

public record OffGroupDiscussionRequest(
        //String id, GENERATE
        //PlayerRequest sender, OBTAIN TO TOKEN
        //Timestamp date, GENERATE
        String text,
        String offGroupMissiveId //CUSTOM MAPPER STRING_TO_OFFGROUPMISSIVE
) {
}