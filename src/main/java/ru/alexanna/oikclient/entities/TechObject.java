package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tech_objects")
public class TechObject {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    protected String name;
    @OneToMany(mappedBy = "techObject", cascade = CascadeType.PERSIST)
    protected Set<Location> locations = new HashSet<>();
}
