package br.com.nakatec.checka.service;

import br.com.nakatec.checka.controller.dto.ChecklistResponse;
import br.com.nakatec.checka.domain.Checklist;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChecklistService {
    public ChecklistResponse converteToResponse(Checklist checklist){
        var response = new ChecklistResponse();
        response.setId(checklist.getId());
        response.setDriverId(checklist.getDriver().getId());
        response.setTruckId(checklist.getTruck().getId());
        response.setPreviousKm(checklist.getPreviousKm());
        response.setBroken(checklist.isBroken());
        response.setRegisterDate(checklist.getRegisterDate());
        return response;
    }

    public List<ChecklistResponse> toResponseList(List<Checklist> checklistList){
        return checklistList.stream().map(this::converteToResponse).collect(Collectors.toList());
    }
}
