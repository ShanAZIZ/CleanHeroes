package fr.esgi.g7.clean.heroes.bootstrap.config.domain;


import fr.esgi.clean.heroes.domain.ports.client.HeroCreatorApi;
import fr.esgi.clean.heroes.domain.ports.client.PlayerCreatorApi;
import fr.esgi.g7.clean.heroes.domain.functional.service.HeroCreatorService;
import fr.esgi.g7.clean.heroes.domain.functional.service.PlayerCreatorService;
import fr.esgi.g7.clean.heroes.domain.ports.server.HeroPersistenceSpi;
import fr.esgi.g7.clean.heroes.domain.ports.server.PlayerPersistenceSpi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfiguration {

    @Bean
    public HeroCreatorApi heroCreatorService(HeroPersistenceSpi spi) {
        return new HeroCreatorService(spi);
    }

    @Bean
    public PlayerCreatorApi playerCreatorService(PlayerPersistenceSpi spi) {
        return new PlayerCreatorService(spi);
    }
}
