package it.cynerea.project.be.mapper;

import it.cynerea.project.be.model.dao.Capacity;
import it.cynerea.project.be.model.dao.Chapter;
import it.cynerea.project.be.model.dto.request.CapacityRequest;
import it.cynerea.project.be.model.dto.request.ChapterRequest;
import it.cynerea.project.be.model.dto.response.ChapterResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ChapterMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "title", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "paragraphs", ignore = true)
    Chapter requestToDao(ChapterRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "paragraphs", ignore = true)
    ChapterResponse daoToResponse(Chapter byId);

    Set<ChapterResponse> daoListToResponseSet(List<Chapter> chapterList);
}
