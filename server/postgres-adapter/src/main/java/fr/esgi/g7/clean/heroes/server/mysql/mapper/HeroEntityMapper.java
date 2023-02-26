package fr.esgi.g7.clean.heroes.server.mysql.mapper;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import fr.esgi.g7.clean.heroes.domain.functional.model.Scarcity;
import fr.esgi.g7.clean.heroes.domain.functional.model.Speciality;
import fr.esgi.g7.clean.heroes.server.mysql.entity.HeroEntity;

public interface HeroEntityMapper {

    static Hero toDomain(HeroEntity entity) {
        return Hero.builder()
                .id(entity.getId())
                .name(entity.getName())
                .health(entity.getHealth())
                .experience(entity.getExperience())
                .power(entity.getPower())
                .armor(entity.getArmor())
                .speciality(Speciality.valueOf(entity.getSpeciality()))
                .scarcity(Scarcity.valueOf(entity.getScarcity()))
                .level(entity.getLevel())
                .build();
    }

    static HeroEntity fromDomain(Hero domain){
        return HeroEntity.builder()
                .id(domain.getId())
                .name(domain.getName())
                .health(domain.getHealth())
                .experience(domain.getExperience())
                .power(domain.getPower())
                .armor(domain.getArmor())
                .speciality(domain.getSpeciality().getLabel())
                .scarcity(domain.getScarcity().getLabel())
                .level(domain.getLevel())
                .build();
    }
}
