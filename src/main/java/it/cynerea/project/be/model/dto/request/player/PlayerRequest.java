package it.cynerea.project.be.model.dto.request.player;

import it.cynerea.project.be.model.dao.character.Character;
import it.cynerea.project.be.model.dao.chat.Chat;
import it.cynerea.project.be.model.dao.master.Drop;
import it.cynerea.project.be.model.dao.master.MasterMonster;
import it.cynerea.project.be.model.dao.missive.OffGroupMissive;
import it.cynerea.project.be.model.dao.missive.OffMissive;
import it.cynerea.project.be.model.dao.quest.Quest;
import it.cynerea.project.be.model.dao.system.CharacterLog;
import it.cynerea.project.be.model.dao.system.PlayerIp;
import it.cynerea.project.be.model.dao.system.PlayerLog;
import it.cynerea.project.be.model.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public record PlayerRequest (
    String username,
    String name,
    Gender gender,
    String email
){}