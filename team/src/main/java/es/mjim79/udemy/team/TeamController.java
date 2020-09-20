package es.mjim79.udemy.team;

import org.springframework.web.bind.annotation.*;

@RestController
public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/teams-/{name}")
    public @ResponseBody Team getTeam(@PathVariable String name) {
        return this.teamRepository.findByName(name);
    }

}
