package fr.esgi.g7.clean.heroes.domain.ports.server;

import java.util.Optional;

public interface PersistenceSpi<T, ID> {
    Optional<T> save(T o);
    Optional<T> findById(ID id);
}
