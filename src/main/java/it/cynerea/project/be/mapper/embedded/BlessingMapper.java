package it.cynerea.project.be.mapper.embedded;


import it.cynerea.project.be.model.dao.embedded.Blessing;
import it.cynerea.project.be.model.dto.request.common.BlessingRequest;
import it.cynerea.project.be.model.dto.response.common.BlessingResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BlessingMapper {

    Blessing toEntity(BlessingRequest request);

    BlessingResponse toDto(Blessing entity);

    Set<BlessingResponse> entityListToDtoSet(List<Blessing> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Blessing partialUpdate(BlessingRequest request, @MappingTarget Blessing entity);
}
