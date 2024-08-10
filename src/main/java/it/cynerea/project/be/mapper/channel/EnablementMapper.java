package it.cynerea.project.be.mapper.channel;


import it.cynerea.project.be.mapper.player.GroupMapper;
import it.cynerea.project.be.model.dao.channel.Enablement;
import it.cynerea.project.be.model.dto.request.channel.EnablementRequest;
import it.cynerea.project.be.model.dto.response.channel.EnablementResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {ChannelMapper.class, GroupMapper.class})
public interface EnablementMapper {

    @Mapping(source = "request.groupName", target = "id.group")
    @Mapping(source = "channelName", target = "id.channel")
    Enablement toEntity(EnablementRequest request, String channelName);

    @Mapping(source = "id.group.name", target = "groupName")
    EnablementResponse toDto(Enablement entity);

    Set<EnablementResponse> entityListToDtoSet(List<Enablement> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Enablement partialUpdate(EnablementRequest request, @MappingTarget Enablement entity);
}
