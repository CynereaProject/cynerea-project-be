package it.cynerea.project.be.mapper.party;


import it.cynerea.project.be.mapper.chat.InfluenceMapper;
import it.cynerea.project.be.model.dao.party.Board;
import it.cynerea.project.be.model.dao.party.Discussion;
import it.cynerea.project.be.model.dao.party.Party;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.party.DiscussionRequest;
import it.cynerea.project.be.model.dto.request.party.PartyRequest;
import it.cynerea.project.be.model.dto.response.party.DiscussionResponse;
import it.cynerea.project.be.model.dto.response.party.PartyResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = BoardMapper.class)
public interface DiscussionMapper {

    @Mapping(source = "boardId", target = "board")
    Discussion toEntity(DiscussionRequest request, Player player);

    Board stringToBoard(String id);

    DiscussionResponse toDto(Discussion entity);

    Set<DiscussionResponse> entityListToDtoSet(List<Discussion> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Discussion partialUpdate(DiscussionRequest request, @MappingTarget Discussion entity);
}
