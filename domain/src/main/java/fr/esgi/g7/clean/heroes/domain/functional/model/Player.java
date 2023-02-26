package fr.esgi.g7.clean.heroes.domain.functional.model;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Builder
@Value
public class Player {
    UUID id;
    String username;
    int coins;
    List<Hero> deck;
}