package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "ports")
public class Port {
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    @EqualsAndHashCode.Include
    protected String name;
    protected int baudRate;
    protected boolean parity;
    protected String ktms;
    protected String receivedData;
//    @JsonManagedReference
    @OneToMany(mappedBy = "port", cascade = CascadeType.PERSIST)
    protected Set<CheckPoint> checkPoints = new HashSet<>();
}
