package fr.esgi.g7.clean.heroes.bootstrap;

import fr.esgi.g7.clean.heroes.bootstrap.config.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Import({ApplicationConfiguration.class})
@SpringBootApplication(scanBasePackages = "fr.esgi.g7.clean.heroes")
@EnableJpaRepositories(basePackages = "fr.esgi.g7.clean.heroes.server.postgres.repository")
@EntityScan("fr.esgi.g7.clean.heroes.server.postgres.entity")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
