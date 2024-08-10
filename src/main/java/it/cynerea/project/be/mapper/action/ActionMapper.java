package it.cynerea.project.be.mapper.action;


import it.cynerea.project.be.mapper.character.CharacterMapper;
import it.cynerea.project.be.mapper.embedded.ResistancesMapper;
import it.cynerea.project.be.mapper.embedded.StatsMapper;
import it.cynerea.project.be.mapper.skill.SkillMapper;
import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dto.request.action.ActionRequest;
import it.cynerea.project.be.model.dto.response.action.ActionResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {CharacterMapper.class, SkillMapper.class, ResistancesMapper.class, StatsMapper.class})
public interface ActionMapper {

    @Mapping(source = "skillsId", target = "skills")
    Action toEntity(ActionRequest request, Character character);

    ActionResponse toDto(Action entity);

    Set<ActionResponse> entityListToDtoSet(List<Action> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Action partialUpdate(ActionRequest request, @MappingTarget Action entity);
}
