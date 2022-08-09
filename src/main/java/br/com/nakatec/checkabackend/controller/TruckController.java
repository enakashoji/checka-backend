package br.com.nakatec.checkabackend.controller;

import br.com.nakatec.checkabackend.controller.dto.TruckResponse;
import br.com.nakatec.checkabackend.service.TruckService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TruckController {

    @Autowired
    private TruckService truckService;

    @RequestMapping("/trucks")
    public @ResponseBody List<TruckResponse> getTruckList(){
        return truckService.truckList();
    }
}
