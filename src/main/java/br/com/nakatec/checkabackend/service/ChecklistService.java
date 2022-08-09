package br.com.nakatec.checkabackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nakatec.checkabackend.controller.dto.ChecklistResponse;
import br.com.nakatec.checkabackend.modelo.dominio.Checklist;
import br.com.nakatec.checkabackend.repository.ChecklistRepository;

@Service
public class ChecklistService {

    @Autowired
    private ChecklistRepository checklistRepository;

    public ChecklistResponse converteToResponse(Checklist checklist){
        var response = new ChecklistResponse();
        response.setId(checklist.getId());
        response.setDriver(checklist.getDriver());
        response.setTruck(checklist.getTruck());
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
