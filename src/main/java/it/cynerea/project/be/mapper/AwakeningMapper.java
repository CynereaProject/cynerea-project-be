package it.cynerea.project.be.mapper;

import it.cynerea.project.be.model.dao.Awakening;
import it.cynerea.project.be.model.dto.request.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.AwakeningResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface AwakeningMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "img", source = "img")
    @Mapping(target = "skills", ignore = true)
    Awakening requestToDao(AwakeningRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "img", source = "img")
    //@Mapping(source = "skills", target = "skills", qualifiedByName = "skills")
    @Mapping(target = "skills", ignore = true)
    AwakeningResponse daoToResponse(Awakening awakening);

    Set<AwakeningResponse> daoListToResponseSet(List<Awakening> awakeningList);

    /*@Named("skills")
    default Set<AwakeningSkillDto> skillsDaoToSkillDto(Set<AwakeningSkill> skills){
        return skills.stream().map(awakeningSkill -> {
            return new AwakeningSkillDto(awakeningSkill.getId().getSkill().getId(), awakeningSkill.getRequiredGrade());
        }).collect(Collectors.toSet());
    }*/
}
