package fr.esgi.g7.clean.heroes.client.rest.ressource;

import fr.esgi.clean.heroes.domain.ports.client.PlayerCreatorApi;
import fr.esgi.g7.clean.heroes.client.rest.dto.PlayerCreationDto;
import fr.esgi.g7.clean.heroes.client.rest.dto.PlayerDto;
import fr.esgi.g7.clean.heroes.client.rest.mapper.PlayerDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/players")
public class PlayerRessource
{
    private final PlayerCreatorApi playerCreatorApi;

    @PostMapping
    public ResponseEntity<Object> createPlayer(@RequestBody PlayerCreationDto dto) {
        Optional<PlayerDto> playerDto = playerCreatorApi.create(dto.username()).map(PlayerDtoMapper::toDto);
        return playerDto.<ResponseEntity<Object>>map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
