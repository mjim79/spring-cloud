package es.mjim79.udemy.team;

import java.util.*;

import javax.persistence.*;

import es.mjim79.udemy.team.player.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Team {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String location;

    String mascotte;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    Set<Player> players;

}
