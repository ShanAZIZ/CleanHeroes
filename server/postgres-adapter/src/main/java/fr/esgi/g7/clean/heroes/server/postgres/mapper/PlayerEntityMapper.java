package fr.esgi.g7.clean.heroes.server.postgres.mapper;

import fr.esgi.g7.clean.heroes.domain.functional.model.Player;
import fr.esgi.g7.clean.heroes.server.postgres.entity.PlayerEntity;

public interface PlayerEntityMapper {
    static Player toDomain(PlayerEntity entity){
        return Player.builder().id(entity.getId()).username(entity.getUsername()).coins(entity.getCoins()).deck(entity.getDeck().stream().map(HeroEntityMapper::toDomain).toList()).build();
    }

    static PlayerEntity fromDomain(Player domain) {
        return PlayerEntity.builder().id(domain.getId()).username(domain.getUsername()).coins(domain.getCoins()).deck(domain.getDeck().stream().map(HeroEntityMapper::fromDomain).toList()).build();
    }
}
