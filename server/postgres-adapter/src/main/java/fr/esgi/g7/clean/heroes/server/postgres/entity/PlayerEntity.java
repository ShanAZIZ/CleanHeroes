package fr.esgi.g7.clean.heroes.server.postgres.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "player")
public class PlayerEntity {
    @Id
    @EqualsAndHashCode.Include
    UUID id;
    @Column(unique = true)
    String username;
    @Column
    int coins = 4;
    @OneToMany
    List<HeroEntity> deck;
}
