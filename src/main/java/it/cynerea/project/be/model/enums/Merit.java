package it.cynerea.project.be.model.enums;

import lombok.Getter;

@Getter
public enum Merit {
    C("Comune"),
    NC("Non Comune"),
    R("Raro"),
    MR("Molto Raro"),
    L("Leggendario"),
    D("Divino");

    private final String value;

    Merit(String value) {
        this.value = value;
    }
}
