package fr.esgi.g7.clean.heroes.server.mysql.adapter;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import fr.esgi.g7.clean.heroes.domain.ports.server.HeroPersistenceSpi;
import fr.esgi.g7.clean.heroes.server.mysql.mapper.HeroEntityMapper;
import fr.esgi.g7.clean.heroes.server.mysql.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HeroDatabaseAdapter implements HeroPersistenceSpi {

    private final HeroRepository heroRepository;

    @Override
    @Transactional
    public Optional<Hero> save(Hero o) {
        val entity = HeroEntityMapper.fromDomain(o);
        try {
            return Optional.of(HeroEntityMapper.toDomain(heroRepository.save(entity)));
        }
        catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Hero> findById(UUID uuid) {
        return heroRepository.findById(uuid).map(HeroEntityMapper::toDomain);
    }
}
