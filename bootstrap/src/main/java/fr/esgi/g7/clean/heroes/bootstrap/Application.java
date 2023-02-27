package fr.esgi.g7.clean.heroes.bootstrap;

import fr.esgi.g7.clean.heroes.bootstrap.config.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({ApplicationConfiguration.class})
@SpringBootApplication(scanBasePackages = "fr.esgi.g7.clean.heroes")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
