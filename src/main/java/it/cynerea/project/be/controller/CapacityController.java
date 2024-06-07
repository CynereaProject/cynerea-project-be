package it.cynerea.project.be.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.model.dto.request.CapacityRequest;
import it.cynerea.project.be.model.dto.response.CapacityResponse;
import it.cynerea.project.be.service.CapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/capacity")
@Tag(name = "Capacity")
public class CapacityController {
    @Autowired
    private CapacityService capacityService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody CapacityRequest request) {
        capacityService.create(request);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody CapacityRequest request) {
        capacityService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<CapacityResponse> getById(@PathVariable Integer id) {
        CapacityResponse response = capacityService.getById(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        capacityService.delete(id);
        return ResponseEntity.ok().build();
    }
}