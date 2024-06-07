package it.cynerea.project.be.mapper;

import it.cynerea.project.be.model.dao.Capacity;
import it.cynerea.project.be.model.dto.request.CapacityRequest;
import it.cynerea.project.be.model.dto.response.CapacityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface CapacityMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "maxLevel", source = "maxLevel")
    Capacity requestToDao(CapacityRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "maxLevel", source = "maxLevel")
    CapacityResponse daoToResponse(Capacity capacity);

    Set<CapacityResponse> daoListToResponseSet(List<Capacity> all);
}
