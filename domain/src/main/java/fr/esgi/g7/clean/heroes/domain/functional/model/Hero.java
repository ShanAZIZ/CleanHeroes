package fr.esgi.g7.clean.heroes.domain.functional.model;

import lombok.Value;

import java.util.UUID;

@Value
public class Hero {
    UUID id;
    String name;
    Integer heath;
    Integer experience;
    Integer power;
    Speciality speciality;
    Scarcity scarcity;
    Integer level;
}
