package it.cynerea.project.be.service;

import it.cynerea.project.be.error.BadRequestException;
import it.cynerea.project.be.error.NotFoundException;
import it.cynerea.project.be.mapper.ChatMapper;
import it.cynerea.project.be.model.dao.Chat;
import it.cynerea.project.be.model.dto.request.ChatRequest;
import it.cynerea.project.be.model.dto.response.ChatResponse;
import it.cynerea.project.be.repo.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private ChatMapper chatMapper;

    public void create(ChatRequest request) {
        validateRequest(request);
        Chat chat = chatMapper.requestToDao(request);
        chatRepository.save(chat);
    }

    public void update(Integer id, ChatRequest request) {
        validateRequest(request);
        Chat chat = findById(id);
        chat.setName(request.name());
        chat.setDescription(request.description());
        chat.setImg(request.img());
        chat.setGroupInfluence1(request.groupInfluence1());
        chat.setGroupInfluence2(request.groupInfluence2());
        chat.setGroupInfluence3(request.groupInfluence3());
        chat.setMasterNotes(request.masterNotes());
        chatRepository.save(chat);
    }

    public ChatResponse getById(Integer id) {
        return chatMapper.daoToResponse(findById(id));
    }

    public Set<ChatResponse> getAll() {
        return chatMapper.daoListToResponseSet(chatRepository.findAll());
    }

    public void delete(Integer id) {
        chatRepository.deleteById(id);
    }

    protected Chat findById(Integer id) {
        Optional<Chat> optionalChat = chatRepository.findById(id);
        if(optionalChat.isPresent())
            return optionalChat.get();
        else
            throw new NotFoundException("Chat non trovata!");
    }

    private void validateRequest(ChatRequest request){
        if(Objects.isNull(request))
            throw new BadRequestException("Request is null!");
        if(Objects.isNull(request.name()))
            throw new BadRequestException("Name is null!");
        if(Objects.isNull(request.description()))
            throw new BadRequestException("Description is null!");
        if (Objects.isNull(request.groupInfluence1()) || request.groupInfluence1() < -10 || request.groupInfluence1() > 10)
            throw new BadRequestException("GroupInfluence1 not valid!");
        if (Objects.isNull(request.groupInfluence2()) || request.groupInfluence2() < -10 || request.groupInfluence2() > 10)
            throw new BadRequestException("GroupInfluence2 not valid!");
        if (Objects.isNull(request.groupInfluence3()) || request.groupInfluence3() < -10 || request.groupInfluence3() > 10)
            throw new BadRequestException("GroupInfluence3 not valid!");
    }
}
