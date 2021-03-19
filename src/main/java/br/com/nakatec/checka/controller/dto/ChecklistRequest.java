package br.com.nakatec.checka.controller.dto;

import br.com.nakatec.checka.domain.Checklist;
import lombok.Data;

import java.time.OffsetDateTime;

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
