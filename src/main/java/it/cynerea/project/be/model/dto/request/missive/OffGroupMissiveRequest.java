package it.cynerea.project.be.model.dto.request.missive;

public record OffGroupMissiveRequest(
        //String id, GENERATE
        //PlayerRequest sender, OBTAIN TO TOKEN
        String groupName, //CUSTOM MAPPER STRING_TO_GROUP
        //Timestamp date, GENERATE
        String title,
        String text
        //Set<OffGroupDiscussionRequest> offGroupDiscussions, NULL
        //Set<OffGroupReplyRequest> offGroupReplies NULL
) {
}