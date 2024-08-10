package it.cynerea.project.be.mapper.channel;


import it.cynerea.project.be.model.dao.channel.Channel;
import it.cynerea.project.be.model.dto.request.channel.ChannelRequest;
import it.cynerea.project.be.model.dto.response.channel.ChannelResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = EnablementMapper.class)
public interface ChannelMapper {
    
    Channel toEntity(ChannelRequest request, String name);

    Channel stringToEntity(String name);

    ChannelResponse toDto(Channel entity);

    Set<ChannelResponse> entityListToDtoSet(List<Channel> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Channel partialUpdate(ChannelRequest request, @MappingTarget Channel entity);
}
