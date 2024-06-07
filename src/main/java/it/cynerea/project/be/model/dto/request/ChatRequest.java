package it.cynerea.project.be.model.dto.request;

import java.net.URL;

public record ChatRequest(String name, String description, URL img, Integer groupInfluence1, Integer groupInfluence2, Integer groupInfluence3, String masterNotes) {
}
