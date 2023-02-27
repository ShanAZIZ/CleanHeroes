package fr.esgi.clean.heroes.domain.ports.client;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;

import java.util.Optional;

public interface HeroCreatorApi {
    Optional<Hero> create(String name, String scarcity, String speciality);
}
