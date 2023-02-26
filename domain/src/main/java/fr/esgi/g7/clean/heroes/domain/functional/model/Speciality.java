package fr.esgi.g7.clean.heroes.domain.functional.model;

public enum Speciality {
    Tank(1000, 100, 20),
    Assassin(800, 200, 5),
    Mage(700, 150, 10);

    private final int initialHealth;
    private final int initialPower;
    private final int initialArmor;

    Speciality(int initialHealth, int initialPower, int initialArmor) {
        this.initialHealth = initialHealth;
        this.initialPower = initialPower;
        this.initialArmor = initialArmor;
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
