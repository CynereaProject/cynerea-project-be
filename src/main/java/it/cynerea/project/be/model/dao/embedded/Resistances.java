package it.cynerea.project.be.model.dao.embedded;

import it.cynerea.project.be.model.enums.Affinity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Resistances {
    @Enumerated(EnumType.STRING)
    @Column(name = "physics", nullable = false)
    private Affinity physics;

    @Enumerated(EnumType.STRING)
    @Column(name = "air", nullable = false)
    private Affinity air;

    @Enumerated(EnumType.STRING)
    @Column(name = "water", nullable = false)
    private Affinity water;

    @Enumerated(EnumType.STRING)
    @Column(name = "earth", nullable = false)
    private Affinity earth;

    @Enumerated(EnumType.STRING)
    @Column(name = "fire", nullable = false)
    private Affinity fire;

    @Enumerated(EnumType.STRING)
    @Column(name = "bolt", nullable = false)
    private Affinity bolt;

    @Enumerated(EnumType.STRING)
    @Column(name = "light", nullable = false)
    private Affinity light;

    @Enumerated(EnumType.STRING)
    @Column(name = "dark", nullable = false)
    private Affinity dark;

    @Enumerated(EnumType.STRING)
    @Column(name = "poison", nullable = false)
    private Affinity poison;

}