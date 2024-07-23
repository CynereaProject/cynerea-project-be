package it.cynerea.project.be.model.dto.request.quest;

import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.master.MasterMonster;
import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public record QuestRequest (
    String name,
    UUID masterId,
    Boolean isLock,
    Set<UUID> participantsId
){}