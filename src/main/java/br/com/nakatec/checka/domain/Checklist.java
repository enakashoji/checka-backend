package br.com.nakatec.checka.domain;

import lombok.Data;

import java.time.OffsetDateTime;

public @Data
class Checklist {

    private Long id;
    private Driver driver;
    private Truck truck;
    private double previousKm;
    private double currentKm;
    private OffsetDateTime registerDate;
    private boolean broken;

}
