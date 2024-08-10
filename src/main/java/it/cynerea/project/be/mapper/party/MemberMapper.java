package it.cynerea.project.be.mapper.party;


import it.cynerea.project.be.mapper.character.CharacterMapper;
import it.cynerea.project.be.model.dao.party.Member;
import it.cynerea.project.be.model.dto.request.party.MemberRequest;
import it.cynerea.project.be.model.dto.response.character.CharacterPartyResponse;
import it.cynerea.project.be.model.dto.response.party.MemberResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = CharacterMapper.class)
public interface MemberMapper {

    @Mapping(source = "characterId", target = "id.character")
    Member toEntity(MemberRequest request);

    @Mapping(source = "characterId", target = "id.character")
    Member stringToPartyEntity(String characterId);

    @Mapping(source = "id.character", target = "character")
    MemberResponse toDto(Member entity);

    @Mapping(source = "id.party.name", target = "partyName")
    CharacterPartyResponse toCharacterDto(Member entity);

    Set<MemberResponse> entityListToDtoSet(List<Member> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Member partialUpdate(MemberRequest request, @MappingTarget Member entity);
}
