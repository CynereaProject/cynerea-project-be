package it.cynerea.project.be.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.model.dto.request.AttributeRequest;
import it.cynerea.project.be.model.dto.request.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.AttributeResponse;
import it.cynerea.project.be.model.dto.response.AwakeningResponse;
import it.cynerea.project.be.service.AttributeService;
import it.cynerea.project.be.service.AwakeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/awakening")
@Tag(name = "Awakening")
public class AwakeningController {
    @Autowired
    private AwakeningService awakeningServiceService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody AwakeningRequest request) {
        awakeningServiceService.create(request);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody AwakeningRequest request) {
        awakeningServiceService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<AwakeningResponse> getById(@PathVariable Integer id) {
        AwakeningResponse response = awakeningServiceService.getById(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        awakeningServiceService.delete(id);
        return ResponseEntity.ok().build();
    }

    /*TODO
    aggiunere e rimuovere skill
    * */
}