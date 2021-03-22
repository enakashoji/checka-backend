package br.com.nakatec.checka.service;

import br.com.nakatec.checka.controller.dto.TruckResponse;
import br.com.nakatec.checka.domain.Truck;
import br.com.nakatec.checka.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
