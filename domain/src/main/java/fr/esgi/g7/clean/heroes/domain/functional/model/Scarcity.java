package fr.esgi.g7.clean.heroes.domain.functional.model;

public enum Scarcity {

    COMMON("common", 1.0),
    RARE("rare", 1.1),
    LEGEND("legend", 1.2);

    private final String label;
    private final double multiplier;

    Scarcity(String label, Double multiplier) {
        this.label = label;
        this.multiplier = multiplier;
    }

    public String getLabel() {
        return label;
    }

    public int getMultipliedSpec(int initialValue) {
        return (int) (initialValue * multiplier);
    }
}
