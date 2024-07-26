package it.cynerea.project.be.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/* ADD TO CONTROLLER THAN IMPLEMENT THIS INTERFACE:
@RestController
@RequestMapping("name")
@Tag(name = "NAME")
* */
public interface BaseController<REQ, RES, I> {

    @PostMapping("/create")
    ResponseEntity<Void> create(@RequestHeader String token, @RequestBody REQ request);

    @GetMapping("/readById/{id}")
    ResponseEntity<RES> readById(@RequestHeader String token, @PathVariable I id);

    @GetMapping("/readAll")
    ResponseEntity<Set<RES>> readAll(@RequestHeader String token);

    @PutMapping("/update/{id}")
    ResponseEntity<Void> update(@RequestHeader String token, @PathVariable I id, @RequestBody REQ request);

    @DeleteMapping("/delete")
    ResponseEntity<Void> delete(@RequestHeader String token, @PathVariable I id);

}
