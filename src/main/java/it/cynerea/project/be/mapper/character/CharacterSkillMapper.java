package it.cynerea.project.be.mapper.character;


import it.cynerea.project.be.mapper.skill.SkillMapper;
import it.cynerea.project.be.model.dao.character.CharacterSkill;
import it.cynerea.project.be.model.dto.request.character.CharacterSkillRequest;
import it.cynerea.project.be.model.dto.response.character.CharacterSkillResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = SkillMapper.class)
public interface CharacterSkillMapper {

    @Mapping(source = "skillId", target = "id.skill")
    CharacterSkill toEntity(CharacterSkillRequest request);

    @Mapping(source = "id.skill", target = "skill")
    CharacterSkillResponse toDto(CharacterSkill entity);

    Set<CharacterSkillResponse> entityListToDtoSet(List<CharacterSkill> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CharacterSkill partialUpdate(CharacterSkillRequest request, @MappingTarget CharacterSkill entity);
}
