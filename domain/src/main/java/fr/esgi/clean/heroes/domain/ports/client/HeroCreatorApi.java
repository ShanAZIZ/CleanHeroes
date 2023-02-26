package fr.esgi.clean.heroes.domain.ports.client;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import fr.esgi.g7.clean.heroes.domain.functional.model.Scarcity;
import fr.esgi.g7.clean.heroes.domain.functional.model.Speciality;

import java.util.Optional;

public interface HeroCreatorApi {
    Optional<Hero> create(String name, Scarcity scarcity, Speciality speciality);
}
