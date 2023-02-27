package fr.esgi.g7.clean.heroes.server.postgres.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "hero")
public class HeroEntity {
    @Id
    @EqualsAndHashCode.Include
    UUID id;
    @Column(unique = true)
    String name;
    @Column
    int health;
    @Column
    int experience = 0;
    @Column
    int power;
    @Column
    int armor;
    @Column
    String speciality;
    @Column
    String scarcity;
    @Column
    int level = 1;
}
