package br.com.nakatec.checkabackend.controller.dto;

import lombok.Data;

import java.time.OffsetDateTime;

import br.com.nakatec.checkabackend.modelo.dominio.Checklist;

public @Data
class ChecklistRequest {
    private Long id;
    private Long driverId;
    private Long truckId;
    private double previousKm;
    private double currentKm;
    private OffsetDateTime registerDate;
    private boolean broken;

}
