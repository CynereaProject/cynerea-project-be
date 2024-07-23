package it.cynerea.project.be.model.dao.embedded;

import it.cynerea.project.be.model.enums.Dice;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Stats {
    @Enumerated(EnumType.STRING)
    @Column(name = "strength", nullable = false, length = 2)
    private Dice strength;

    @Enumerated(EnumType.STRING)
    @Column(name = "dexterity", nullable = false, length = 2)
    private Dice dexterity;

    @Enumerated(EnumType.STRING)
    @Column(name = "insight", nullable = false, length = 2)
    private Dice insight;

    @Enumerated(EnumType.STRING)
    @Column(name = "constitution", nullable = false, length = 2)
    private Dice constitution;

    @Enumerated(EnumType.STRING)
    @Column(name = "willpower", nullable = false, length = 2)
    private Dice willpower;

    @Enumerated(EnumType.STRING)
    @Column(name = "charisma", nullable = false, length = 2)
    private Dice charisma;

    @Column(name = "health", nullable = false)
    private Integer health;

    @Column(name = "mana", nullable = false)
    private Integer mana;

    @Column(name = "dodge", nullable = false)
    private Integer dodge;

    @Column(name = "temper", nullable = false)
    private Integer temper;

    @Column(name = "resistance", nullable = false)
    private Integer resistance;
}