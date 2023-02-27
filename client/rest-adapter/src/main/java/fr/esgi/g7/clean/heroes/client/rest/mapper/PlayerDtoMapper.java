package fr.esgi.g7.clean.heroes.client.rest.mapper;

import fr.esgi.g7.clean.heroes.client.rest.dto.PlayerCreationDto;
import fr.esgi.g7.clean.heroes.client.rest.dto.PlayerDto;
import fr.esgi.g7.clean.heroes.domain.functional.model.Player;

public interface PlayerDtoMapper {

    static PlayerDto toDto(Player player){
        return new PlayerDto(
                player.getId(),
                player.getUsername(),
                player.getCoins(),
                player.getDeck()
                        .stream()
                        .map((HeroDtoMapper::toDto))
                        .toList()
        );
    }

    static Player PlayerCreationDtoToDomain(PlayerCreationDto dto) {
        return Player.builder().username(dto.username()).build();
    }
}
