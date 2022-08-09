package br.com.nakatec.checkabackend.controller;

import br.com.nakatec.checkabackend.controller.dto.ChecklistResponse;
import br.com.nakatec.checkabackend.service.ChecklistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChecklistController {

    @Autowired
    private ChecklistService checklistService;

    @RequestMapping("/checklist")
    public List<ChecklistResponse> checklist(){
        return checklistService.getAllChecklist();

    }
}
