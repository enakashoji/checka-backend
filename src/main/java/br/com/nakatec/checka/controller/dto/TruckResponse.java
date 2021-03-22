package br.com.nakatec.checka.controller.dto;

import lombok.Data;

public @Data
class TruckResponse {
    private Long id;
    private String license;
    private String brand;
    private String model;
    private String sinceYear;
    private String description;
}
