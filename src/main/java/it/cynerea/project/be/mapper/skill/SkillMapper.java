package it.cynerea.project.be.mapper.skill;


import it.cynerea.project.be.model.dao.skill.Skill;
import it.cynerea.project.be.model.dto.request.skill.SkillRequest;
import it.cynerea.project.be.model.dto.response.skill.SkillResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SkillMapper {

    Skill toEntity(SkillRequest request);

    Skill longToEntity(Long id);

    SkillResponse toDto(Skill entity);

    Set<SkillResponse> entityListToDtoSet(List<Skill> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Skill partialUpdate(SkillRequest request, @MappingTarget Skill entity);

}
