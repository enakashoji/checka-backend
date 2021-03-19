package br.com.nakatec.checka.domain;

import lombok.Data;

public @Data class Truck {
    private Long id;
    private String license;
    private String brand;
    private String model;
    private String sinceYear;
    private String description;
}
