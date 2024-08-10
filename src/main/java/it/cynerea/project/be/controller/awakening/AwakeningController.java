package it.cynerea.project.be.controller.awakening;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.controller.BaseController;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.awakening.AwakeningResponse;
import it.cynerea.project.be.model.enums.ManagementLogType;
import it.cynerea.project.be.service.awakening.AwakeningService;
import it.cynerea.project.be.service.system.ManagementLogService;
import it.cynerea.project.be.service.system.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("awakening")
@Tag(name = "AWAKENING")
public class AwakeningController implements BaseController<AwakeningRequest, AwakeningResponse, Long> {
    @Autowired
    private AwakeningService awakeningService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private ManagementLogService managementLogService;

    @Override
    public ResponseEntity<Void> create(String token, AwakeningRequest request) {
        Player user = tokenService.validateToken(token, "Staff");
        awakeningService.create(request, null);
        managementLogService.create(user, "awakening", ManagementLogType.CREATE);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<AwakeningResponse> readById(String token, Long id) {
        AwakeningResponse response = awakeningService.readById(id, null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Set<AwakeningResponse>> readAll(String token) {
        Set<AwakeningResponse> response = awakeningService.readAll(null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> update(String token, Long id, AwakeningRequest request) {
        Player user = tokenService.validateToken(token, "Staff");
        awakeningService.update(id, request, null);
        managementLogService.create(user, "awakening", ManagementLogType.UPDATE);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @Deprecated
    public ResponseEntity<Void> delete(String token, Long id) {
        return  new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
