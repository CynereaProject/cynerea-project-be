package it.cynerea.project.be.mapper.party;


import it.cynerea.project.be.mapper.player.PlayerMapper;
import it.cynerea.project.be.model.dao.party.Board;
import it.cynerea.project.be.model.dao.party.Communication;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.party.BoardRequest;
import it.cynerea.project.be.model.dto.request.party.CommunicationRequest;
import it.cynerea.project.be.model.dto.response.party.BoardResponse;
import it.cynerea.project.be.model.dto.response.party.CommunicationResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {PlayerMapper.class, PartyMapper.class})
public interface CommunicationMapper {

    @Mapping(source = "player", target = "id.player")
    @Mapping(source = "partyName", target = "id.party")
    Communication toEntity(CommunicationRequest request, Player player, String partyName);

    @Mapping(source = "id.player", target = "player")
    @Mapping(source = "id.date", target = "date")
    CommunicationResponse toDto(Communication entity);

    Set<CommunicationResponse> entityListToDtoSet(List<Communication> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Communication partialUpdate(CommunicationRequest request, @MappingTarget Communication entity);
}
