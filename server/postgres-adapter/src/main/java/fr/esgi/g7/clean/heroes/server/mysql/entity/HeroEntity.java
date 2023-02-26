package fr.esgi.g7.clean.heroes.server.mysql.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Id @EqualsAndHashCode.Include
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
    @Column // TODO: manage enum in persisting
    String speciality;
    @Column
    String scarcity;
    @Column
    int level = 1;
}
