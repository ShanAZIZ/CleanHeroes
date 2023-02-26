package fr.esgi.g7.clean.heroes.domain.functional.model;

public enum Speciality {
    Tank("tank", 1000, 100, 20),
    Assassin("assassin", 800, 200, 5),
    Mage("mage", 700, 150, 10);

    private final String label;
    private final int initialHealth;
    private final int initialPower;
    private final int initialArmor;

    Speciality(String label, int initialHealth, int initialPower, int initialArmor) {
        this.label = label;
        this.initialHealth = initialHealth;
        this.initialPower = initialPower;
        this.initialArmor = initialArmor;
    }

    public String getLabel() {
        return label;
    }

    public int getInitialHealth() {
        return initialHealth;
    }

    public int getInitialPower() {
        return initialPower;
    }

    public int getInitialArmor() {
        return initialArmor;
    }
}
