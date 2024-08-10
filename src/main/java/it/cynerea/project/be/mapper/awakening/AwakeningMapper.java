package it.cynerea.project.be.mapper.awakening;

import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.awakening.Awakening;
import it.cynerea.project.be.model.dto.request.action.ActionRequest;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {AwakeningSkillMapper.class})
public interface AwakeningMapper {

    Awakening toEntity(AwakeningRequest request);

    Awakening longToEntity(Long id);

    //AwakeningResponse toDto(Awakening entity);

    //Set<AwakeningResponse> entityListToDtoSet(List<Awakening> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Awakening partialUpdate(AwakeningRequest request, @MappingTarget Awakening entity);
}
