package it.cynerea.project.be.mapper.channel;

import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.channel.Channel;
import it.cynerea.project.be.model.dto.request.action.ActionRequest;
import it.cynerea.project.be.model.dto.request.channel.ChannelRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {EnablementMapper.class})
public interface ChannelMapper {

    Channel toEntity(ChannelRequest request, String name);

    Channel stringToEntity(String name);

    //ChannelResponse toDto(Channel entity);

    //Set<ChannelResponse> entityListToDtoSet(List<Channel> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Channel partialUpdate(ChannelRequest request, @MappingTarget Channel entity);
}
