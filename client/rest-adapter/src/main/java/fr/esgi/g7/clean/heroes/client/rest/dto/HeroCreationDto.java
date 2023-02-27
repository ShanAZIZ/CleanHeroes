package fr.esgi.g7.clean.heroes.client.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record HeroCreationDto(
        @JsonProperty("name") String name,
        @JsonProperty("speciality") String speciality,
        @JsonProperty("scarcity") String scarcity){
}
