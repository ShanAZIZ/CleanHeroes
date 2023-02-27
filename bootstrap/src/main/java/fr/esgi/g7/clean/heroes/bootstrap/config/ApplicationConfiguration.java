package fr.esgi.g7.clean.heroes.bootstrap.config;

import fr.esgi.g7.clean.heroes.bootstrap.config.domain.DomainConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DomainConfiguration.class})
public class ApplicationConfiguration {

}
