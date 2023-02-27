package fr.esgi.clean.heroes.domain.ports.client;

import fr.esgi.g7.clean.heroes.domain.functional.model.Player;

import java.util.Optional;

public interface PlayerCreatorApi {
    Optional<Player> create(String username);
}
