package es.mjim79.udemy.team;

import java.util.*;

import org.springframework.data.repository.*;
import org.springframework.data.rest.core.annotation.*;

@RestResource(path = "teams", rel = "teams")
public interface TeamRepository extends CrudRepository<Team, Long> {

    @Override
    List<Team> findAll();

    Team findByName(String name);

}
