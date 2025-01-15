package com.pauline.TP3.controller;

import com.pauline.TP3.model.FormulaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormulaireController {
    @Autowired
    FormulaireRepository FormulaireRepository;
    @GetMapping("/adresse")
    public String showFormulaire(Model model) {
        model.addAttribute("allAddresses", FormulaireRepository.findAll());
        return "formulaire";
    }
}