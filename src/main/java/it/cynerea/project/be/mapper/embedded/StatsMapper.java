package it.cynerea.project.be.mapper.embedded;


import it.cynerea.project.be.mapper.character.InventoryMapper;
import it.cynerea.project.be.model.dao.embedded.Equipment;
import it.cynerea.project.be.model.dao.embedded.Stats;
import it.cynerea.project.be.model.dto.request.common.EquipmentRequest;
import it.cynerea.project.be.model.dto.request.common.StatsRequest;
import it.cynerea.project.be.model.dto.response.common.EquipmentResponse;
import it.cynerea.project.be.model.dto.response.common.StatsResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = InventoryMapper.class)
public interface StatsMapper {

    Stats toEntity(StatsRequest request);

    StatsResponse toDto(Stats entity);

    Set<StatsResponse> entityListToDtoSet(List<Stats> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Stats partialUpdate(StatsRequest request, @MappingTarget Stats entity);
}
