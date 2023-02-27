package fr.esgi.g7.clean.heroes.server.postgres.repository;

import fr.esgi.g7.clean.heroes.server.postgres.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

import static org.springframework.transaction.annotation.Propagation.MANDATORY;

@Repository
@Transactional(propagation = MANDATORY)
public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {
}
