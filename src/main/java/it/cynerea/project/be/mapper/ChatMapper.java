package it.cynerea.project.be.mapper;

import it.cynerea.project.be.model.dao.Chat;
import it.cynerea.project.be.model.dto.request.ChatRequest;
import it.cynerea.project.be.model.dto.response.ChatResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "img", source = "img")
    @Mapping(target = "groupInfluence1", source = "groupInfluence1")
    @Mapping(target = "groupInfluence2", source = "groupInfluence2")
    @Mapping(target = "groupInfluence3", source = "groupInfluence3")
    @Mapping(target = "masterNotes", source = "masterNotes")
    Chat requestToDao(ChatRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "img", source = "img")
    @Mapping(target = "groupInfluence1", source = "groupInfluence1")
    @Mapping(target = "groupInfluence2", source = "groupInfluence2")
    @Mapping(target = "groupInfluence3", source = "groupInfluence3")
    @Mapping(target = "masterNotes", source = "masterNotes")
    @Mapping(target = "characters", ignore = true)
    ChatResponse daoToResponse(Chat chat);

    Set<ChatResponse> daoListToResponseSet(List<Chat> chatList);
}
