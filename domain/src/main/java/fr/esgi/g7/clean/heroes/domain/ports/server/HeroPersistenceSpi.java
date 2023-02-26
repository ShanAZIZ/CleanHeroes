package fr.esgi.g7.clean.heroes.domain.ports.server;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;

import java.util.UUID;

public interface HeroPersistenceSpi extends PersistenceSpi<Hero, UUID> {
}
