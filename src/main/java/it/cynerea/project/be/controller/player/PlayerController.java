package it.cynerea.project.be.controller.player;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.controller.BaseController;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.player.PlayerRequest;
import it.cynerea.project.be.model.dto.request.system.PlayerLimitationRequest;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import it.cynerea.project.be.model.enums.PlayerLogType;
import it.cynerea.project.be.repository.system.TokenRepository;
import it.cynerea.project.be.service.player.PlayerService;
import it.cynerea.project.be.service.system.PlayerLogService;
import it.cynerea.project.be.service.system.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("player")
@Tag(name = "PLAYER")
public class PlayerController implements BaseController<PlayerRequest, PlayerResponse, String> {
    @Autowired
    private TokenService tokenService;
    @Autowired
    private PlayerService playerService;
    @Autowired
    private PlayerLogService playerLogService;

    @Override
    public ResponseEntity<Void> create(@Deprecated String token, PlayerRequest request) {
        playerService.create(request, null);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<PlayerResponse> readById(String token, String id) {
        Player user = tokenService.validateToken(token);
        PlayerResponse response = playerService.readById(id, null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Set<PlayerResponse>> readAll(@Deprecated String token) {
        Player user = tokenService.validateToken(token);
        Set<PlayerResponse> response = playerService.readAll(null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> update(String token, String id, PlayerRequest request) {
        Player user = tokenService.validateToken(token);
        playerService.update(id, request, user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @Deprecated
    public ResponseEntity<Void> delete(String token, String id) {
        return null;
    }

    @PatchMapping("/ban/{id}")
    public ResponseEntity<Void> ban(@RequestHeader String token, @PathVariable String id, @RequestBody PlayerLimitationRequest request) {
        Player user = tokenService.validateToken(token, "Staff", "Vice-Staff", "Guida");
        Player target = playerService.ban(id, request.numberOfDays(), user);
        playerLogService.create(user, target, request.cause(), PlayerLogType.Ban);
        tokenService.deleteAllByPlayerId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/unban/{id}")
    public ResponseEntity<Void> unban(@RequestHeader String token, @PathVariable String id, @RequestBody String cause) {
        Player user = tokenService.validateToken(token, "Staff", "Vice-Staff", "Guida");
        Player target = playerService.unban(id, user);
        playerLogService.create(user, target, cause, PlayerLogType.UnBan);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/training/{id}")
    public ResponseEntity<Void> training(@RequestHeader String token, @PathVariable String id, @RequestBody String cause) {
        Player user = tokenService.validateToken(token, "Staff", "Vice-Staff", "Guida");
        Player target = playerService.training(id, user);
        playerLogService.create(user, target, cause, PlayerLogType.Training);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/unTraining/{id}")
    public ResponseEntity<Void> unTraining(@RequestHeader String token, @PathVariable String id, @RequestBody String cause) {
        Player user = tokenService.validateToken(token, "Staff", "Vice-Staff", "Guida");
        Player target = playerService.unTraining(id, user);
        playerLogService.create(user, target, cause, PlayerLogType.UnTraining);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/silenced/{id}")
    public ResponseEntity<Void> silenced(@RequestHeader String token, @PathVariable String id, @RequestBody String cause) {
        Player user = tokenService.validateToken(token, "Staff", "Vice-Staff", "Guida");
        Player target = playerService.silenced(id, user);
        playerLogService.create(user, target, cause, PlayerLogType.Silenced);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/unSilenced/{id}")
    public ResponseEntity<Void> unSilenced(@RequestHeader String token, @PathVariable String id, @RequestBody String cause) {
        Player user = tokenService.validateToken(token, "Staff", "Vice-Staff", "Guida");
        Player target = playerService.unSilenced(id, user);
        playerLogService.create(user, target, cause, PlayerLogType.UnSilenced);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
