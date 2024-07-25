package it.cynerea.project.be.exception;

import java.util.UUID;

public class NotAuthException extends RuntimeException {

    public NotAuthException(String token) {
        super("Token " + token + " not valid!");
    }
}
