package br.com.nakatec.checka.service;

import br.com.nakatec.checka.controller.dto.DriverResponse;
import br.com.nakatec.checka.domain.Driver;
import br.com.nakatec.checka.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public DriverResponse getDriver(Long id) {
        Optional<Driver> driverOptional = driverRepository.findById(id);
        return driverOptional.map((this::converteToResponse)).orElseThrow();
    }
}
