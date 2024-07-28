package it.cynerea.project.be.model.dto.request.chat;

public record InfluenceRequest(
        Long chatId,//CUSTOM MAPPER LONG_TO_CHAT
        String partyName,//CUSTOM MAPPER STRING_T_PARTY
        Integer worth
) {
}