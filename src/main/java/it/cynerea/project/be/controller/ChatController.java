package it.cynerea.project.be.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.model.dto.request.ChatRequest;
import it.cynerea.project.be.model.dto.response.ChatResponse;
import it.cynerea.project.be.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/chat")
@Tag(name = "Chat")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody ChatRequest request) {
        chatService.create(request);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody ChatRequest request) {
        chatService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<ChatResponse> getById(@PathVariable Integer id) {
        ChatResponse response = chatService.getById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<Set<ChatResponse>> getAll() {
        Set<ChatResponse> response = chatService.getAll();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        chatService.delete(id);
        return ResponseEntity.ok().build();
    }
}