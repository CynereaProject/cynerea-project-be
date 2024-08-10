package it.cynerea.project.be.mapper.character;


import it.cynerea.project.be.mapper.thing.ThingMapper;
import it.cynerea.project.be.model.dao.character.Inventory;
import it.cynerea.project.be.model.dto.request.character.InventoryRequest;
import it.cynerea.project.be.model.dto.response.character.InventoryResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {ThingMapper.class, CharacterMapper.class})
public interface InventoryMapper {

    @Mapping(source = "thingId", target = "thing.id")
    @Mapping(source = "characterId", target = "character.id")
    Inventory toEntity(InventoryRequest request);

    InventoryResponse toDto(Inventory entity);

    Set<InventoryResponse> entityListToDtoSet(List<Inventory> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Inventory partialUpdate(InventoryRequest request, @MappingTarget Inventory entity);
}
