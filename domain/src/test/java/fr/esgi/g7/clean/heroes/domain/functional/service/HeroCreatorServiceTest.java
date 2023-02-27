package fr.esgi.g7.clean.heroes.domain.functional.service;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import fr.esgi.g7.clean.heroes.domain.functional.model.Scarcity;
import fr.esgi.g7.clean.heroes.domain.functional.model.Speciality;
import fr.esgi.g7.clean.heroes.domain.ports.server.HeroPersistenceSpi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HeroCreatorServiceTest {

    @Mock
    private HeroPersistenceSpi spi;

    @InjectMocks
    private HeroCreatorService heroCreatorService;

    @Test
    public void testCreate() {
        String name = "Superman";
        Scarcity scarcity = Scarcity.RARE;
        Speciality speciality = Speciality.Assassin;

        Hero hero = Hero.builder()
                .name(name)
                .speciality(speciality)
                .scarcity(scarcity)
                .health(scarcity.getMultipliedSpec(speciality.getInitialHealth()))
                .power(scarcity.getMultipliedSpec(speciality.getInitialPower()))
                .armor(scarcity.getMultipliedSpec(speciality.getInitialArmor()))
                .experience(0)
                .level(1)
                .build();

        when(spi.save(hero)).thenReturn(Optional.of(hero));

        // When
        Optional<Hero> createdHero = heroCreatorService.create(name, scarcity, speciality);

        // Then
        assertThat(createdHero).isPresent()
                .get().isEqualTo(hero);
    }
}
