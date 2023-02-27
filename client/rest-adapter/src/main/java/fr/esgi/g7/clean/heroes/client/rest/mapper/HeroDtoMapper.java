package fr.esgi.g7.clean.heroes.client.rest.mapper;

import fr.esgi.g7.clean.heroes.client.rest.dto.HeroDto;
import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;

public interface HeroDtoMapper {
    static HeroDto toDto(Hero hero) {
        return new HeroDto(
                hero.getId(),
                hero.getName(),
                hero.getHealth(),
                hero.getExperience(),
                hero.getPower(),
                hero.getArmor(),
                hero.getSpeciality().getLabel(),
                hero.getScarcity().getLabel(),
                hero.getLevel()
        );
    }
}
