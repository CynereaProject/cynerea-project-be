package it.cynerea.project.be.model.dto.response.common;

import it.cynerea.project.be.model.enums.Dice;

public record StatsResponse(
    Dice strength,
    Dice dexterity,
    Dice insight,
    Dice constitution,
    Dice willpower,
    Dice charisma,
    Integer health,
    Integer mana,
    Integer dodge,
    Integer temper,
    Integer resistance
){}