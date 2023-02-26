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
    int experience;
    int power;
    int armor;
    Speciality speciality;
    Scarcity scarcity;
    int level;
}
