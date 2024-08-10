package it.cynerea.project.be.mapper.awakening;


import it.cynerea.project.be.mapper.skill.SkillMapper;
import it.cynerea.project.be.model.dao.awakening.AwakeningSkill;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningSkillRequest;
import it.cynerea.project.be.model.dto.response.awakening.AwakeningSkillResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        uses = SkillMapper.class)
public interface AwakeningSkillMapper {

    @Mapping(source = "skillId", target = "id.skill")
    AwakeningSkill toEntity(AwakeningSkillRequest request);

    @Mapping(source = "id.skill", target = "skill")
    AwakeningSkillResponse toDto(AwakeningSkill entity);

    Set<AwakeningSkillResponse> entityListToDtoSet(List<AwakeningSkill> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AwakeningSkill partialUpdate(AwakeningSkillRequest request, @MappingTarget AwakeningSkill entity);
}
