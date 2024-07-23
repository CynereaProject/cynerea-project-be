package it.cynerea.project.be.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Set;

/* ADD TO CONTROLLER THAN IMPLEMENT THIS INTERFACE:
@RestController
@RequestMapping("name")
@Tag(name = "NAME")
* */
public interface BaseController<REQ, RES, I> {

    @PostMapping("/create")
    ResponseEntity<Void> create(REQ request);

    @GetMapping("/readById")
    ResponseEntity<RES> readById(I id);

    @GetMapping("/readAll")
    ResponseEntity<Set<RES>> readAll();

    @PutMapping("/update")
    ResponseEntity<Void> update(I id, REQ request);

    @DeleteMapping("/delete")
    ResponseEntity<Void> delete(I id);

}
