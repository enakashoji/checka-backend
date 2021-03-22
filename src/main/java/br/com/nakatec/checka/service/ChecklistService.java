package br.com.nakatec.checka.service;

import br.com.nakatec.checka.controller.dto.ChecklistResponse;
import br.com.nakatec.checka.domain.Checklist;
import br.com.nakatec.checka.repository.ChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChecklistService {

    @Autowired
    private ChecklistRepository checklistRepository;

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

    public List<ChecklistResponse> getAllChecklist() {
        List<Checklist> responseList = (List<Checklist>) checklistRepository.findAll();
        return  responseList.stream().map(this::converteToResponse).collect(Collectors.toList());
    }
}
