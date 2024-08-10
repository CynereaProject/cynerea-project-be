package it.cynerea.project.be.mapper.race;


import it.cynerea.project.be.mapper.embedded.StatsMapper;
import it.cynerea.project.be.mapper.skill.SkillMapper;
import it.cynerea.project.be.model.dao.race.Race;
import it.cynerea.project.be.model.dto.request.race.RaceRequest;
import it.cynerea.project.be.model.dto.response.character.CharacterRaceResponse;
import it.cynerea.project.be.model.dto.response.race.RaceResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {SkillMapper.class, StatsMapper.class})
public interface RaceMapper {

    @Mapping(source = "nextStepId", target = "nextStep.id")
    Race toEntity(RaceRequest request);

    Race longToEntity(Long id);

    RaceResponse toDto(Race entity);

    CharacterRaceResponse toCharacterDto(Race entity);

    Set<RaceResponse> entityListToDtoSet(List<Race> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Race partialUpdate(RaceRequest request, @MappingTarget Race entity);
}
