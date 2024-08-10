package it.cynerea.project.be.mapper.channel;

import it.cynerea.project.be.model.dao.channel.Channel;
import it.cynerea.project.be.model.dao.channel.Enablement;
import it.cynerea.project.be.model.dto.request.channel.ChannelRequest;
import it.cynerea.project.be.model.dto.request.channel.EnablementRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EnablementMapper {

    @Mapping(source = "channelName", target = "id.channel")
    @Mapping(source = "groupName", target = "id.group")
    Enablement toEntity(EnablementRequest request);

    //EnablementResponse toDto(Enablement entity);

    //Set<EnablementResponse> entityListToDtoSet(List<Enablement> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Enablement partialUpdate(EnablementRequest request, @MappingTarget Enablement entity);
}
