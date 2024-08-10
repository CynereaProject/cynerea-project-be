package it.cynerea.project.be.controller.system;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.system.LoginRequest;
import it.cynerea.project.be.service.player.PlayerService;
import it.cynerea.project.be.service.system.PlayerIpService;
import it.cynerea.project.be.service.system.TokenService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Objects;

@RestController
@RequestMapping("system/auth")
@Tag(name = "AUTH")
public class AuthController {
    @Autowired
    private TokenService tokenService;
    @Autowired
    private PlayerService playerService;
    @Autowired
    private PlayerIpService playerIpService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request, HttpServletRequest httpServletRequest) {
        Player user = playerService.authorize(request);
        if(Objects.nonNull(user)) {
            if(user.getIsBan() && user.getBanEndDate().after(new Date())) {
                String body =  "Ban fino al " + user.getBanEndDate().toString();
                return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
            } else {
                String token = tokenService.create(user.getId());
                playerIpService.create(user, httpServletRequest.getRemoteAddr());
                String s = httpServletRequest.getRemoteHost();
                return new ResponseEntity<>(token, HttpStatus.OK);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/logout/{token}")
    public ResponseEntity<Void> logout(@PathVariable String token) {
        tokenService.delete(token);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
