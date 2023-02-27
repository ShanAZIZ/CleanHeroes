package fr.esgi.g7.clean.heroes.server.postgres.adapter;

import fr.esgi.g7.clean.heroes.domain.functional.model.Player;
import fr.esgi.g7.clean.heroes.domain.ports.server.PlayerPersistenceSpi;
import fr.esgi.g7.clean.heroes.server.postgres.mapper.PlayerEntityMapper;
import fr.esgi.g7.clean.heroes.server.postgres.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerDatabaseAdapter implements PlayerPersistenceSpi {

    private final PlayerRepository playerRepository;

    @Override
    @Transactional
    public Optional<Player> save(Player o) {
        val entity = PlayerEntityMapper.fromDomain(o);
        try {
            return Optional.of(PlayerEntityMapper.toDomain(playerRepository.save(entity)));
        }
        catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    @Transactional
    public Optional<Player> findById(UUID uuid) {
        return playerRepository.findById(uuid).map(PlayerEntityMapper::toDomain);
    }
}
