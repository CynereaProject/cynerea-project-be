package it.cynerea.project.be.model.dto.request.character;


public record InventoryRequest(
        //String id, GENERATE
        Long thingId, //CUSTOM MAPPER LONG_TO_THING
        //CharacterRequest character, OBTAIN TO TOKEN OR PATH VARIABLE(FOR CHANGE)
        //String customName,
        //String customDescription,
        //String masterNote,
        Integer quantity //INCREMENT
) {
}