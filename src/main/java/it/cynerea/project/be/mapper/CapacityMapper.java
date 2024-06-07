package it.cynerea.project.be.mapper;

import it.cynerea.project.be.model.dao.Capacity;
import it.cynerea.project.be.model.dto.request.CapacityRequest;
import it.cynerea.project.be.model.dto.response.CapacityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CapacityMapper {
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "maxLevel", source = "maxLevel")
    Capacity requestToDao(CapacityRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "maxLevel", source = "maxLevel")
    CapacityResponse dtoToResponse(Capacity capacity);
}
