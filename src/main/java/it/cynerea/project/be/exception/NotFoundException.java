package it.cynerea.project.be.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String entity, String id) {
        super("Entity " + entity + " whit id " + id + " not found!");
    }
}
