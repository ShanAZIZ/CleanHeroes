package fr.esgi.g7.clean.heroes.domain.functional.model;

import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
public class Player {
    UUID id;
    String username;
    Integer coins;
    List<Hero> deck;
}