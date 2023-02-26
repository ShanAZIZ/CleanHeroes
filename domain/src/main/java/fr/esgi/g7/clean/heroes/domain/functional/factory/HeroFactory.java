package fr.esgi.g7.clean.heroes.domain.functional.factory;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import fr.esgi.g7.clean.heroes.domain.functional.model.Scarcity;
import fr.esgi.g7.clean.heroes.domain.functional.model.Speciality;

import java.util.UUID;

public interface HeroFactory {
    Hero createHero(UUID id, String name, Speciality speciality, Scarcity scarcity);
}
