package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "locations")
public class Location {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    protected String name;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "tech_object_id", nullable = false)
    protected TechObject techObject;
    @OneToMany(mappedBy = "location", cascade = CascadeType.PERSIST)
    protected Set<CheckPoint> checkPoints = new HashSet<>();
}
