package it.cynerea.project.be.mapper.party;


import it.cynerea.project.be.mapper.chat.InfluenceMapper;
import it.cynerea.project.be.model.dao.party.Member;
import it.cynerea.project.be.model.dao.party.Party;
import it.cynerea.project.be.model.dto.request.party.MemberRequest;
import it.cynerea.project.be.model.dto.request.party.PartyRequest;
import it.cynerea.project.be.model.dto.response.character.CharacterPartyResponse;
import it.cynerea.project.be.model.dto.response.party.MemberResponse;
import it.cynerea.project.be.model.dto.response.party.PartyResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {MemberMapper.class, InfluenceMapper.class})
public interface PartyMapper {

    Party toEntity(PartyRequest request);

    Party stringToEntity(String name);

    PartyResponse toDto(Party entity);

    Set<PartyResponse> entityListToDtoSet(List<Party> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Party partialUpdate(PartyRequest request, @MappingTarget Party entity);
}
