package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
@Table(name = "locations")
public class Location {
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    protected String name;
    @ToString.Exclude
//    @JsonBackReference
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "tech_object_id", nullable = false)
    protected TechObject techObject;
//    @JsonManagedReference
    @OneToMany(mappedBy = "location", cascade = CascadeType.PERSIST)
    protected Set<CheckPoint> checkPoints = new HashSet<>();
}
