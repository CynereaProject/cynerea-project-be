package it.cynerea.project.be.mapper.character;


import it.cynerea.project.be.mapper.order.OrderMapper;
import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.character.CharacterOrder;
import it.cynerea.project.be.model.dto.request.character.CharacterOrderRequest;
import it.cynerea.project.be.model.dto.response.character.CharacterOrderResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = OrderMapper.class)
public interface CharacterOrderMapper {

    @Mapping(source = "request.orderId", target = "id.order")
    @Mapping(source = "character", target = "id.character")
    CharacterOrder toEntity(CharacterOrderRequest request, Character character);

    @Mapping(source = "id.order.id", target = "id")
    @Mapping(source = "id.order.name", target = "name")
    CharacterOrderResponse toDto(CharacterOrder entity);

    Set<CharacterOrderResponse> entityListToDtoSet(List<CharacterOrder> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CharacterOrder partialUpdate(CharacterOrderRequest request, @MappingTarget CharacterOrder entity);
}
