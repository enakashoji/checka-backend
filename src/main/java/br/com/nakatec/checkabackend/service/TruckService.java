package br.com.nakatec.checkabackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nakatec.checkabackend.controller.dto.TruckResponse;
import br.com.nakatec.checkabackend.modelo.dominio.Truck;
import br.com.nakatec.checkabackend.repository.TruckRepository;

@Service
public class TruckService {

    @Autowired
    private TruckRepository truckRepository;

    public List<TruckResponse> truckList() {
        List<Truck> truckList = (List<Truck>) truckRepository.findAll();
        return truckList.stream().map(this::converteToResponse).collect(Collectors.toList());
    }

    public TruckResponse converteToResponse(Truck truck) {
        var response = new TruckResponse();
        response.setId(truck.getId());
        response.setLicense(truck.getLicense());
        response.setBrand(truck.getBrand());
        response.setModel(truck.getModel());
        response.setSinceYear(truck.getSinceYear());
        response.setDescription(truck.getDescription());
        return response;
    }
}
