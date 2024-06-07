package it.cynerea.project.be.service;

import it.cynerea.project.be.error.BadRequestException;
import it.cynerea.project.be.error.NotFoundException;
import it.cynerea.project.be.mapper.ChapterMapper;
import it.cynerea.project.be.model.dao.Capacity;
import it.cynerea.project.be.model.dao.Chapter;
import it.cynerea.project.be.model.dto.request.CapacityRequest;
import it.cynerea.project.be.model.dto.request.ChapterRequest;
import it.cynerea.project.be.model.dto.response.ChapterResponse;
import it.cynerea.project.be.repo.CapacityRepository;
import it.cynerea.project.be.repo.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private ChapterMapper chapterMapper;

    public void create(ChapterRequest request) {
        validateRequest(request);
        Chapter chapter = chapterMapper.requestToDao(request);
        chapterRepository.save(chapter);
    }

    public void update(Integer id, ChapterRequest request) {
        validateRequest(request);
        Chapter chapter = findById(id);
        chapter.setTitle(request.title());
        chapter.setDescription(request.description());
        chapterRepository.save(chapter);
    }

    public ChapterResponse getById(Integer id) {
        return chapterMapper.daoToResponse(findById(id));
    }

    public Set<ChapterResponse> getAll() {
        return  chapterMapper.daoListToResponseSet(chapterRepository.findAll());
    }

    public void delete(Integer id) {
        chapterRepository.deleteById(id);
    }

    protected Chapter findById(Integer id) {
        Optional<Chapter> optionalChapter = chapterRepository.findById(id);
        if(optionalChapter.isPresent())
            return optionalChapter.get();
        else
            throw new NotFoundException("Capitolo non trovato!");
    }

    private void validateRequest(ChapterRequest request){
        if(Objects.isNull(request))
            throw new BadRequestException("Request is null!");
        if(Objects.isNull(request.title()))
            throw new BadRequestException("Title is null!");
        if(Objects.isNull(request.description()))
            throw new BadRequestException("Description is null!");
    }
}
