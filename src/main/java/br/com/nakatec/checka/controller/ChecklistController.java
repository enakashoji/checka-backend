package br.com.nakatec.checka.controller;

import br.com.nakatec.checka.controller.dto.ChecklistResponse;
import br.com.nakatec.checka.domain.Checklist;
import br.com.nakatec.checka.domain.Driver;
import br.com.nakatec.checka.domain.Truck;
import br.com.nakatec.checka.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
public class ChecklistController {

    @Autowired
    ChecklistService checklistService;

    @RequestMapping("/checklist")
    public ChecklistResponse checklist(){
        var driver = new Driver();
        driver.setId(1L);
        driver.setCpf("000.000.000-00");
        driver.setName("José Raimundo");

        var truck = new Truck();
        truck.setId(1L);
        truck.setBrand("VW");
        truck.setModel("25-280");
        truck.setLicense("KKK-5555");
        truck.setDescription("Prata");

        var checklist = new Checklist();
        checklist.setId(1L);
        checklist.setDriver(driver);
        checklist.setTruck(truck);
        checklist.setBroken(false);
        checklist.setPreviousKm(50.0);
        checklist.setCurrentKm(100.0);
        checklist.setRegisterDate(OffsetDateTime.now());

        return checklistService.converteToResponse(checklist);

    }
}
