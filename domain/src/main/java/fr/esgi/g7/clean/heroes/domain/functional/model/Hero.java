package fr.esgi.g7.clean.heroes.domain.functional.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class Hero {
    UUID id;
    String name;
    int health;
    int experience = 0;
    int power;
    int armor;
    Speciality speciality;
    Scarcity scarcity;
    int level = 1;

    public Hero(UUID id, String name, Speciality speciality, Scarcity scarcity) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.scarcity = scarcity;
        this.health = scarcity.getMultipliedSpec(speciality.getInitialHealth());
        this.power = scarcity.getMultipliedSpec(speciality.getInitialPower());
        this.armor = scarcity.getMultipliedSpec(speciality.getInitialArmor());
    }
}
