package es.mjim79.udemy.team.player;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Player {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String position;

}
