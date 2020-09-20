package es.mjim79.udemy.team;

import java.util.*;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import es.mjim79.udemy.team.player.*;

@SpringBootApplication
public class TeamApplication {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamApplication(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TeamApplication.class, args);
    }

    @PostConstruct
    public void init() {
        final Set<Player> players = new HashSet<>();
        players.add(Player.builder().name("Sergio Ramos").position("central").build());
        players.add(Player.builder().name("Benzema").position("delantero").build());

        final Team team = Team.builder().location("Madrid").mascotte("no tiene").name("Madrid").players(players)
                .build();
        this.teamRepository.save(team);
    }

}
