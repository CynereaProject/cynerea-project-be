package it.cynerea.project.be.mapper.chat;


import it.cynerea.project.be.mapper.party.PartyMapper;
import it.cynerea.project.be.model.dao.chat.Chat;
import it.cynerea.project.be.model.dao.chat.Influence;
import it.cynerea.project.be.model.dto.request.chat.ChatRequest;
import it.cynerea.project.be.model.dto.request.chat.InfluenceRequest;
import it.cynerea.project.be.model.dto.response.chat.ChatResponse;
import it.cynerea.project.be.model.dto.response.chat.InfluenceResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {ChatMapper.class, PartyMapper.class})
public interface InfluenceMapper {

    @Mapping(source = "chatId", target = "id.chat")
    @Mapping(source = "request.partyName", target = "id.party")
    Influence toEntity(InfluenceRequest request, Long chatId);

    @Mapping(source = "id.party.name", target = "partyName")
    InfluenceResponse toDto(Influence entity);

    Set<InfluenceResponse> entityListToDtoSet(List<Influence> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Influence partialUpdate(InfluenceRequest request, @MappingTarget Influence entity);
}
