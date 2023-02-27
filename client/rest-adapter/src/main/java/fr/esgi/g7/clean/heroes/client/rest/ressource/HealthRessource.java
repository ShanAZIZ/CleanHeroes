package fr.esgi.g7.clean.heroes.client.rest.ressource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/health")
public class HealthRessource {

    @GetMapping
    public ResponseEntity<String> health() {
        return ResponseEntity.of(Optional.of("App is running"));
    }
}
