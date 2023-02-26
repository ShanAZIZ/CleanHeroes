package fr.esgi.g7.clean.heroes.domain.functional.factory;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import fr.esgi.g7.clean.heroes.domain.functional.model.Scarcity;
import fr.esgi.g7.clean.heroes.domain.functional.model.Speciality;

import java.util.UUID;

public class DefaultHeroFactory implements HeroFactory{
    @Override
    public Hero createHero(UUID id, String name, Speciality speciality, Scarcity scarcity) {
        return Hero.builder()
                .name(name)
                .id(id)
                .speciality(speciality)
                .scarcity(scarcity)
                .health(scarcity.getMultipliedSpec(speciality.getInitialHealth()))
                .power(scarcity.getMultipliedSpec(speciality.getInitialPower()))
                .armor(scarcity.getMultipliedSpec(speciality.getInitialArmor()))
                .build();
    }
}
