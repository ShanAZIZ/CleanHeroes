package fr.esgi.g7.clean.heroes.domain.functional.service;

import fr.esgi.g7.clean.heroes.domain.functional.model.Player;
import fr.esgi.g7.clean.heroes.domain.ports.server.PlayerPersistenceSpi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PlayerCreatorServiceTest {

    @Mock
    private PlayerPersistenceSpi spi;

    @InjectMocks
    private PlayerCreatorService playerCreatorService;

    @Test
    public void testCreate() {
        String username = "test-user";

        Player player = Player.builder()
                .username(username)
                .coins(4)
                .deck(new ArrayList<>())
                .build();

        when(spi.save(player)).thenReturn(Optional.of(player));

        // When
        Optional<Player> createdPlayer = playerCreatorService.create(username);

        // Then
        assertThat(createdPlayer).isPresent()
                .get().isEqualTo(player);
    }
}
