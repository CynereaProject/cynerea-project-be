package it.cynerea.project.be.mapper.awakening;

import it.cynerea.project.be.model.dao.awakening.Awakening;
import it.cynerea.project.be.model.dao.awakening.AwakeningSkill;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningRequest;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningSkillRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {SkillMapper.class})
public interface AwakeningSkillMapper {

    @Mapping(source = "request.skillId", target = "id.skill")
    @Mapping(source = "awakening", target = "id.awakening")
    AwakeningSkill toEntity(AwakeningSkillRequest request, Awakening awakening);

    //AwakeningSkillResponse toDto(AwakeningSkill entity);

    //Set<AwakeningSkillResponse> entityListToDtoSet(List<AwakeningSkill> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AwakeningSkill partialUpdate(AwakeningSkillRequest request, @MappingTarget AwakeningSkill entity);
}
