package it.cynerea.project.be.mapper.embedded;


import it.cynerea.project.be.mapper.character.InventoryMapper;
import it.cynerea.project.be.model.dao.embedded.Equipment;
import it.cynerea.project.be.model.dto.request.common.EquipmentRequest;
import it.cynerea.project.be.model.dto.response.common.EquipmentResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = InventoryMapper.class)
public interface EquipmentMapper {

    Equipment toEntity(EquipmentRequest request);

    EquipmentResponse toDto(Equipment entity);

    Set<EquipmentResponse> entityListToDtoSet(List<Equipment> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Equipment partialUpdate(EquipmentRequest request, @MappingTarget Equipment entity);
}
