package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "check_points")
public class CheckPoint {
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    protected String name;
    @Column(nullable = false)
    protected int address;

    @ToString.Exclude
//    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    protected Location location;
    @ToString.Exclude
//    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "port_id", nullable = false)
    protected Port port;
    //    @JsonManagedReference
    @OneToMany(mappedBy = "checkPoint", cascade = CascadeType.PERSIST)
    protected Set<Signal> signals = new HashSet<>();
}
