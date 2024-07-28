package it.cynerea.project.be.model.dto.request.embedded;

public record BlessingRequest(
        //String name, PATH VARIABLE
        String effect,
        String img

) {
}