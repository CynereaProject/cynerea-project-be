package it.cynerea.project.be.model.dto.response.missive;

import it.cynerea.project.be.model.dto.response.player.GroupResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;
import java.util.Set;


public record OffGroupMissiveResponse(
        String id,
        PlayerResponse sender,
        GroupResponse group,
        Timestamp date,
        String title,
        String text,
        Set<OffGroupDiscussionResponse> offGroupDiscussions,
        Set<OffGroupReplyResponse> offGroupReplies
) {
}