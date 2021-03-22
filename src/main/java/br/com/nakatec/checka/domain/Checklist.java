package br.com.nakatec.checka.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
public @Data
class Checklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Truck truck;

    private double previousKm;
    private double currentKm;
    private OffsetDateTime registerDate;
    private boolean broken;

}
