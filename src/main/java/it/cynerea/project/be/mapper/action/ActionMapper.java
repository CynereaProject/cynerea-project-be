package it.cynerea.project.be.mapper.action;

import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dto.request.action.ActionRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {SkillMapper.class, StatsMapper.class, ResistenceMapper.class})
public interface ActionMapper {

    Action toEntity(ActionRequest request, Character character);

    Action stringToEntity(String id);

    //ActionResponse toDto(Action entity);

    //Set<ActionResponse> entityListToDtoSet(List<Action> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Action partialUpdate(ActionRequest request, @MappingTarget Action entity);
}
