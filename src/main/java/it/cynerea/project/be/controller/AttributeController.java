package it.cynerea.project.be.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.model.dto.request.AttributeRequest;
import it.cynerea.project.be.model.dto.response.AttributeResponse;
import it.cynerea.project.be.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/attribute")
@Tag(name = "Attribute")
public class AttributeController {
    @Autowired
    private AttributeService attributeService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody AttributeRequest request) {
        attributeService.create(request);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody AttributeRequest request) {
        attributeService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<AttributeResponse> getById(@PathVariable Integer id) {
        AttributeResponse response = attributeService.getById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<Set<AttributeResponse>> getAll() {
        Set<AttributeResponse> response = attributeService.getAll();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        attributeService.delete(id);
        return ResponseEntity.ok().build();
    }
}