package it.cynerea.project.be.controller.system;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.cynerea.project.be.model.enums.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("system/enum")
@Tag(name = "ENUM")
public class EnumController {

    @GetMapping("/getAffinities")
    public ResponseEntity<List<Affinity>> getAffinities() {
        return ResponseEntity.ok(Arrays.stream(Affinity.values()).toList());
    }

    @GetMapping("/getCharacterLogTypes")
    public ResponseEntity<List<CharacterLogType>> getCharacterLogTypes() {
        return ResponseEntity.ok(Arrays.stream(CharacterLogType.values()).toList());
    }

    @GetMapping("/getDices")
    public ResponseEntity<List<Dice>> getDices() {
        return ResponseEntity.ok(Arrays.stream(Dice.values()).toList());
    }

    @GetMapping("/getGenders")
    public ResponseEntity<List<Gender>> getGenders() {
        return ResponseEntity.ok(Arrays.stream(Gender.values()).toList());
    }

    @GetMapping("/getManufactures")
    public ResponseEntity<List<Manufacture>> getManufactures() {
        return ResponseEntity.ok(Arrays.stream(Manufacture.values()).toList());
    }

    @GetMapping("/getPlayerLogTypes")
    public ResponseEntity<List<PlayerLogType>> getPlayerLogTypes() {
        return ResponseEntity.ok(Arrays.stream(PlayerLogType.values()).toList());
    }

    @GetMapping("/getSkillTypes")
    public ResponseEntity<List<SkillType>> getSkillTypes() {
        return ResponseEntity.ok(Arrays.stream(SkillType.values()).toList());
    }

    @GetMapping("/getThingTypes")
    public ResponseEntity<List<ThingType>> getThingTypes() {
        return ResponseEntity.ok(Arrays.stream(ThingType.values()).toList());
    }
}
