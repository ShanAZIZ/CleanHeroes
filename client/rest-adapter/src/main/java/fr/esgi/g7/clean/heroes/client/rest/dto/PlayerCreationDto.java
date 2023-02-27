package fr.esgi.g7.clean.heroes.client.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PlayerCreationDto(@JsonProperty("username") String username) { }
