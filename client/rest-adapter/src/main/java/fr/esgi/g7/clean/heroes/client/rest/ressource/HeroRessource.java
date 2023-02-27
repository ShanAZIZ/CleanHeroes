package fr.esgi.g7.clean.heroes.client.rest.ressource;

import fr.esgi.clean.heroes.domain.ports.client.HeroCreatorApi;
import fr.esgi.g7.clean.heroes.client.rest.dto.HeroCreationDto;
import fr.esgi.g7.clean.heroes.client.rest.dto.HeroDto;
import fr.esgi.g7.clean.heroes.client.rest.mapper.HeroDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/heroes")
public class HeroRessource {

    private final HeroCreatorApi heroCreatorApi;

    @PostMapping
    public ResponseEntity<HeroDto> createHero(@RequestBody HeroCreationDto dto) {
        Optional<HeroDto> heroDto = heroCreatorApi.create(dto.name(), dto.speciality(), dto.scarcity()).map(HeroDtoMapper::toDto);
        return heroDto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

}
