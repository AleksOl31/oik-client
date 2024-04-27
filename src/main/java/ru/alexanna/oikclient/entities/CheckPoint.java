package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "check_points")
public class CheckPoint {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    protected String name;
    @Column(nullable = false)
    protected int address;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    protected Location location;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "port_id", nullable = false)
    protected Port port;
    @OneToMany(mappedBy = "checkPoint", cascade = CascadeType.PERSIST)
    protected Set<Signal> signals = new HashSet<>();
}
