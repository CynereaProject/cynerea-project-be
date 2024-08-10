package it.cynerea.project.be.mapper.character;


import it.cynerea.project.be.mapper.awakening.AwakeningMapper;
import it.cynerea.project.be.mapper.embedded.BlessingMapper;
import it.cynerea.project.be.mapper.embedded.ResistancesMapper;
import it.cynerea.project.be.mapper.embedded.StatsMapper;
import it.cynerea.project.be.mapper.party.MemberMapper;
import it.cynerea.project.be.mapper.player.PlayerMapper;
import it.cynerea.project.be.mapper.race.RaceMapper;
import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dto.request.character.CharacterRequest;
import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {PlayerMapper.class, MemberMapper.class, AwakeningMapper.class, BlessingMapper.class, TraitMapper.class, CharacterOrderMapper.class, RaceMapper.class, InventoryMapper.class, BlessingMapper.class, ResistancesMapper.class, StatsMapper.class})
public interface CharacterMapper {

    @Mapping(source = "playerId", target = "player")
    @Mapping(source = "raceId", target = "race")
    Character toEntity(CharacterRequest request);

    Character stringToEntity(String id);

    CharacterResponse toDto(Character entity);

    Set<CharacterResponse> entityListToDtoSet(List<Character> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Character partialUpdate(CharacterRequest request, @MappingTarget Character entity);
}
