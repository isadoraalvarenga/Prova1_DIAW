package com.example.Prova1DIAW.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Prova1DIAW.service.CandidatosTseService;

@Controller 
public class CandidatosTseController {
    
    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseService candidatosTseService){
        this.candidatosTseService = candidatosTseService;
    }

    @GetMapping("/candidatos")
    public String carregarCsv(
        @RequestParam(required = false) String cargo,
        @RequestParam(required = false) String partido,
        @RequestParam(required = false) String texto,
        Model model){
            candidatosTseService.carregarCsv();
            return  "";
    }

}
