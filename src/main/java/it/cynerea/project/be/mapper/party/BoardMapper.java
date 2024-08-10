package it.cynerea.project.be.mapper.party;


import it.cynerea.project.be.mapper.chat.InfluenceMapper;
import it.cynerea.project.be.model.dao.party.Board;
import it.cynerea.project.be.model.dao.party.Party;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.party.BoardRequest;
import it.cynerea.project.be.model.dto.request.party.PartyRequest;
import it.cynerea.project.be.model.dto.response.party.BoardResponse;
import it.cynerea.project.be.model.dto.response.party.PartyResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = DiscussionMapper.class)
public interface BoardMapper {

    @Mapping(source = "request.partyName", target = "party")
    Board toEntity(BoardRequest request, Player player);

    BoardResponse toDto(Board entity);

    Set<BoardResponse> entityListToDtoSet(List<Board> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Board partialUpdate(BoardRequest request, @MappingTarget Board entity);
}
