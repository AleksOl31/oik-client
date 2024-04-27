package ru.alexanna.oikclient.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "signals")
public class Signal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected int id;
    protected String name;
    protected int number;
    protected int channel;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "check_point_id", nullable = false)
    protected CheckPoint checkPoint;
}
