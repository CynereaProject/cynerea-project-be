package it.cynerea.project.be.exception;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /*@ExceptionHandler(ValidationException.class)
    public ResponseEntity<List<InvalidParam>> handleException(ValidationException e) {
        log.error(String.valueOf(e));
        return ResponseEntity.badRequest().body(e.getViolations());
    }

    @ExceptionHandler(GenericException.class)
    public ResponseEntity<String> handleException(GenericException e) {
        log.error(String.valueOf(e));
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handleException(MethodArgumentTypeMismatchException e) {
        log.error(String.valueOf(e));
        return ResponseEntity.badRequest().body(e.getMessage());
    }*/

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleException(EntityNotFoundException e) {
        log.error(String.valueOf(e));
        return ResponseEntity.badRequest().body("Id not found!");
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<String> handleException(SQLIntegrityConstraintViolationException e) {
        log.error(String.valueOf(e));
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleException(NotFoundException e) {
        log.error(String.valueOf(e));
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(NotAuthException.class)
    public ResponseEntity<String> handleException(NotAuthException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }

}

