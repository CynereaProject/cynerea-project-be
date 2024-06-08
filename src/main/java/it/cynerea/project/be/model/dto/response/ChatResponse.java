package it.cynerea.project.be.model.dto.response;

import java.net.URL;
import java.util.Set;

public record ChatResponse(Integer id, String name, String description, String img, Integer groupInfluence1, Integer groupInfluence2, Integer groupInfluence3, String masterNotes, Set<Long> characters) {
}
