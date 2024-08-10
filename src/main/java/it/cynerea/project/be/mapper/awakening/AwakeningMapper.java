package it.cynerea.project.be.mapper.awakening;


import it.cynerea.project.be.model.dao.awakening.Awakening;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.awakening.AwakeningResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = AwakeningSkillMapper.class)
public interface AwakeningMapper {

    Awakening toEntity(AwakeningRequest request);

    AwakeningResponse toDto(Awakening entity);

    Set<AwakeningResponse> entityListToDtoSet(List<Awakening> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Awakening partialUpdate(AwakeningRequest request, @MappingTarget Awakening entity);

}
