package br.com.nakatec.checka.controller;

import br.com.nakatec.checka.controller.dto.DriverResponse;
import br.com.nakatec.checka.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;


    @RequestMapping("/driver")
    public @ResponseBody
    DriverResponse getDriver(@RequestParam Long id){
        return driverService.getDriver(id);
    }
}
