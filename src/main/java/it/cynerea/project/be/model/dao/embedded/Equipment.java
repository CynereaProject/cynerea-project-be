package it.cynerea.project.be.model.dao.embedded;

import it.cynerea.project.be.model.dao.character.Inventory;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Equipment {
    @OneToOne
    @JoinColumn(name = "left_hand")
    private Inventory leftHand;

    @OneToOne
    @JoinColumn(name = "right_hand")
    private Inventory rightHand;

    @OneToOne
    @JoinColumn(name = "body")
    private Inventory body;

    @OneToOne
    @JoinColumn(name = "accessory1")
    private Inventory accessory1;

    @OneToOne
    @JoinColumn(name = "accessory2")
    private Inventory accessory2;

    @OneToOne
    @JoinColumn(name = "accessory3")
    private Inventory accessory3;

    @OneToOne
    @JoinColumn(name = "accessory4")
    private Inventory accessory4;

    @OneToOne
    @JoinColumn(name = "accessory5")
    private Inventory accessory5;
}