package fr.esgi.g7.clean.heroes.domain.functional.model;

public enum Scarcity {

    COMMON("common", 1.0),
    RARE("rare", 1.1),
    LEGEND("legend", 1.2);

    private final String scarcity;
    private final double multiplier;

    Scarcity(String scarcity, Double multiplier) {
        this.scarcity = scarcity;
        this.multiplier = multiplier;
    }

    public String getScarcity() {
        return scarcity;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public int getMultipliedSpec(int initialValue) {
        return (int) (initialValue * multiplier);
    }
}
