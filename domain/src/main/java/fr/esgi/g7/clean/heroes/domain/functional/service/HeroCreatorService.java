package fr.esgi.g7.clean.heroes.domain.functional.service;

import fr.esgi.clean.heroes.domain.ports.client.HeroCreatorApi;
import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import fr.esgi.g7.clean.heroes.domain.functional.model.Scarcity;
import fr.esgi.g7.clean.heroes.domain.functional.model.Speciality;
import fr.esgi.g7.clean.heroes.domain.ports.server.HeroPersistenceSpi;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class HeroCreatorService implements HeroCreatorApi {

    private final HeroPersistenceSpi spi;

    @Override
    public Optional<Hero> create(String name, Scarcity scarcity, Speciality speciality) {
        Hero hero =  Hero.builder()
                .name(name)
                .speciality(speciality)
                .scarcity(scarcity)
                .health(scarcity.getMultipliedSpec(speciality.getInitialHealth()))
                .power(scarcity.getMultipliedSpec(speciality.getInitialPower()))
                .armor(scarcity.getMultipliedSpec(speciality.getInitialArmor()))
                .experience(0)
                .level(1)
                .build();
        return spi.save(hero);
    }
}
