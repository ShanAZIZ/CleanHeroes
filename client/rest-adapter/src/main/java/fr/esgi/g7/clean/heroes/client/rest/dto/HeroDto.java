package fr.esgi.g7.clean.heroes.client.rest.dto;

import java.util.UUID;

public record HeroDto(
        UUID id,
        String name,
        int health,
        int experience,
        int power,
        int armor,
        String speciality,
        String scarcity,
        int level) {
}
