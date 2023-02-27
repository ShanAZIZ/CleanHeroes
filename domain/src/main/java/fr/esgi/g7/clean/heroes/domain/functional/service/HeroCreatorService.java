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
    public Optional<Hero> create(String name, String scarcity, String speciality) {
        try {
            Speciality spec = Speciality.valueOf(speciality);
            Scarcity scarce = Scarcity.valueOf(scarcity);
            Hero hero =  Hero.builder()
                    .name(name)
                    .speciality(spec)
                    .scarcity(scarce)
                    .health(scarce.getMultipliedSpec(spec.getInitialHealth()))
                    .power(scarce.getMultipliedSpec(spec.getInitialPower()))
                    .armor(scarce.getMultipliedSpec(spec.getInitialArmor()))
                    .experience(0)
                    .level(1)
                    .build();
            return spi.save(hero);
        }catch (IllegalArgumentException e) {
            return Optional.empty();
        }

    }
}
