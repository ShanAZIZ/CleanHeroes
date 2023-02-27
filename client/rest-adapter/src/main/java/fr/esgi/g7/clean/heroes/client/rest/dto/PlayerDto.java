package fr.esgi.g7.clean.heroes.client.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
import java.util.UUID;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record PlayerDto(UUID id, String username, int coins, List<HeroDto> heroes) {}
