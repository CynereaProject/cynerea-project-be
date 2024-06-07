package it.cynerea.project.be.mapper;

import it.cynerea.project.be.model.dao.Awakening;
import it.cynerea.project.be.model.dto.request.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.AwakeningResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface AwakeningMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "img", source = "img")
    Awakening requestToDao(AwakeningRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "img", source = "img")
    //@Mapping(source = "skills", target = "skills", qualifiedByName = "skills")
    @Mapping(target = "skills", ignore = true)
    AwakeningResponse daoToResponse(Awakening awakening);

    /*@Named("skills")
    default Set<AwakeningSkillDto> skillsDaoToSkillDto(Set<AwakeningSkill> skills){
        return skills.stream().map(awakeningSkill -> {
            return new AwakeningSkillDto(awakeningSkill.getId().getSkill().getId(), awakeningSkill.getRequiredGrade());
        }).collect(Collectors.toSet());
    }*/
}
