package fr.esgi.g7.clean.heroes.domain.functional.service;

import fr.esgi.clean.heroes.domain.ports.client.PlayerCreatorApi;
import fr.esgi.g7.clean.heroes.domain.functional.model.Player;
import fr.esgi.g7.clean.heroes.domain.ports.server.PlayerPersistenceSpi;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Optional;

@RequiredArgsConstructor
public class PlayerCreatorService implements PlayerCreatorApi {

    private final PlayerPersistenceSpi spi;

    @Override
    public Optional<Player> create(String username) {
        Player p = Player.builder().username(username).coins(4).deck(new ArrayList<>()).build();
        return spi.save(p);
    }
}
