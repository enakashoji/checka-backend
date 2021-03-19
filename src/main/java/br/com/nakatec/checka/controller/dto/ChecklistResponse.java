package br.com.nakatec.checka.controller.dto;

import lombok.Data;

import java.time.OffsetDateTime;

public @Data class ChecklistResponse {

    private Long id;
    private Long driverId;
    private Long truckId;
    private double previousKm;
    private OffsetDateTime registerDate;
    private boolean broken;
}
