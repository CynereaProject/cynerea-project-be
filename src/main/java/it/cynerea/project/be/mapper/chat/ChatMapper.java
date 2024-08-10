package it.cynerea.project.be.mapper.chat;


import it.cynerea.project.be.model.dao.character.Trait;
import it.cynerea.project.be.model.dao.chat.Chat;
import it.cynerea.project.be.model.dto.request.character.TraitRequest;
import it.cynerea.project.be.model.dto.request.chat.ChatRequest;
import it.cynerea.project.be.model.dto.response.character.TraitResponse;
import it.cynerea.project.be.model.dto.response.chat.ChatResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = InfluenceMapper.class)
public interface ChatMapper {

    Chat toEntity(ChatRequest request);

    Chat longToEntity(Long id);

    ChatResponse toDto(Chat entity);

    Set<ChatResponse> entityListToDtoSet(List<Chat> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Chat partialUpdate(ChatRequest request, @MappingTarget Chat entity);
}
