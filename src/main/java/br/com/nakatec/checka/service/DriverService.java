package br.com.nakatec.checka.service;

import br.com.nakatec.checka.controller.dto.DriverResponse;
import br.com.nakatec.checka.domain.Driver;
import br.com.nakatec.checka.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public DriverResponse converteToResponse(Driver driver) {
        var response = new DriverResponse();
        response.setId(driver.getId());
        response.setName(driver.getName());
        response.setCpf(driver.getCpf());
        return response;
    }

    public List<DriverResponse> toResponseList(List<Driver> driverList) {
        return driverList.stream().map(this::converteToResponse).collect(Collectors.toList());
    }

    public DriverResponse getDriver(Long id) {
        Optional<Driver> driverOptional = driverRepository.findById(id);
        return driverOptional.map((this::converteToResponse)).orElseThrow();
    }
}
