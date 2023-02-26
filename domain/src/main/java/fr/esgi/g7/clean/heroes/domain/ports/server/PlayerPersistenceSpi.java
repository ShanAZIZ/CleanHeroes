package fr.esgi.g7.clean.heroes.domain.ports.server;

import fr.esgi.g7.clean.heroes.domain.functional.model.Player;

import java.util.UUID;

public interface PlayerPersistenceSpi extends PersistenceSpi<Player, UUID> {
}
