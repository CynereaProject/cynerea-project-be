package it.cynerea.project.be.mapper.channel;

import it.cynerea.project.be.model.dao.channel.Channel;
import it.cynerea.project.be.model.dao.channel.Message;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.channel.ChannelRequest;
import it.cynerea.project.be.model.dto.request.channel.MessageRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {ChannelMapper.class})
public interface MessageMapper {

    @Mapping(source = "channelName", target = "channel")
    Message toEntity(MessageRequest request, Player player);

    Message stringToEntity(String id);

    //MessageResponse toDto(Message entity);

    //Set<MessageResponse> entityListToDtoSet(List<Message> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Message partialUpdate(MessageRequest request, @MappingTarget Message entity);
}
