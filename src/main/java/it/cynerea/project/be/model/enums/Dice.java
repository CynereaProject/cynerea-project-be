package it.cynerea.project.be.model.enums;

public enum Dice {
    D4,
    D6,
    D8,
    D10,
    D16,
    D20;

    public Integer getValue() {
        return switch (this.name()) {
            case "D4" -> 4;
            case "D6" -> 6;
            case "D8" -> 8;
            case "D10" -> 10;
            case "D16" -> 16;
            case "D20" -> 20;
            default -> throw new IllegalStateException("Unexpected value: " + this.name());
        };
    }
}
