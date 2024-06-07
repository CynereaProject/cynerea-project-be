package it.cynerea.project.be.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.model.dto.request.ChapterRequest;
import it.cynerea.project.be.model.dto.response.ChapterResponse;
import it.cynerea.project.be.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/chapter")
@Tag(name = "Chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody ChapterRequest request) {
        chapterService.create(request);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody ChapterRequest request) {
        chapterService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<ChapterResponse> getById(@PathVariable Integer id) {
        ChapterResponse response = chapterService.getById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<Set<ChapterResponse>> getAll() {
        Set<ChapterResponse> response = chapterService.getAll();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        chapterService.delete(id);
        return ResponseEntity.ok().build();
    }
}