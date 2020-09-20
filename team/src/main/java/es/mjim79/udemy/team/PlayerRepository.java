package es.mjim79.udemy.team;

import java.util.*;

import org.springframework.data.repository.*;
import org.springframework.data.rest.core.annotation.*;

import es.mjim79.udemy.team.player.*;

@RestResource(path = "players", rel = "players")
public interface PlayerRepository extends CrudRepository<Player, Long> {

    @Override
    List<Player> findAll();

    Player findByName(String name);

}
