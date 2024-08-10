package it.cynerea.project.be.mapper.order;


import it.cynerea.project.be.mapper.skill.SkillMapper;
import it.cynerea.project.be.model.dao.order.Order;
import it.cynerea.project.be.model.dao.order.OrderSkill;
import it.cynerea.project.be.model.dto.request.order.OrderRequest;
import it.cynerea.project.be.model.dto.request.order.OrderSkillRequest;
import it.cynerea.project.be.model.dto.response.order.OrderResponse;
import it.cynerea.project.be.model.dto.response.order.OrderSkillResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {SkillMapper.class, OrderMapper.class})
public interface OrderSkillMapper {

    @Mapping(source = "request.skillId", target = "id.skill")
    @Mapping(source = "orderId", target = "id.order")
    OrderSkill toEntity(OrderSkillRequest request, Long orderId);

    @Mapping(source = "id.skill", target = "skill")
    OrderSkillResponse toDto(OrderSkill entity);

    Set<OrderSkillResponse> entityListToDtoSet(List<OrderSkill> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OrderSkill partialUpdate(OrderSkillRequest request, @MappingTarget OrderSkill entity);
}
