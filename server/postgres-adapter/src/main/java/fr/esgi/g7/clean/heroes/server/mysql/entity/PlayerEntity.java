package fr.esgi.g7.clean.heroes.server.mysql.entity;

import fr.esgi.g7.clean.heroes.domain.functional.model.Hero;
import lombok.*;

import javax.persistence.*;
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
    @Id @EqualsAndHashCode.Include
    UUID id;
    @Column(unique = true)
    String username;
    @Column
    int coins = 4;
    @OneToMany
    List<Hero> deck;
}
