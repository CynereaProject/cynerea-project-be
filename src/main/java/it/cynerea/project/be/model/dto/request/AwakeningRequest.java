package it.cynerea.project.be.model.dto.request;



import java.net.URL;
import java.util.Set;

public record AwakeningRequest(String name, String description, URL img) {
}
