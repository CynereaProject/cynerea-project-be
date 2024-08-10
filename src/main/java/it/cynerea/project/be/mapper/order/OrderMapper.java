package it.cynerea.project.be.mapper.order;


import it.cynerea.project.be.model.dao.character.Trait;
import it.cynerea.project.be.model.dao.order.Order;
import it.cynerea.project.be.model.dto.request.character.TraitRequest;
import it.cynerea.project.be.model.dto.request.order.OrderRequest;
import it.cynerea.project.be.model.dto.response.character.TraitResponse;
import it.cynerea.project.be.model.dto.response.order.OrderResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = OrderSkillMapper.class)
public interface OrderMapper {

    Order toEntity(OrderRequest request);

    Order longToEntity(Long id);

    OrderResponse toDto(Order entity);

    Set<OrderResponse> entityListToDtoSet(List<Order> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Order partialUpdate(OrderRequest request, @MappingTarget Order entity);
}
