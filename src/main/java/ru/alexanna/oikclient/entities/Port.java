package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "ports")
public class Port {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    protected String name;
    protected int baudRate;
    protected boolean parity;
    protected String ktms;
    protected String receivedData;
    @OneToMany(mappedBy = "port", cascade = CascadeType.PERSIST)
    protected Set<CheckPoint> checkPoints = new HashSet<>();
}
