package com.pauline.TP3.controller;

//import ch.qos.logback.core.model.Model;
import com.pauline.TP3.Service.MeteoService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {

    @Autowired
    MeteoService meteoService;

    @PostMapping("/meteo")
    public String handelInput(@RequestParam("address") String inputValue, Model model) throws Exception {

        ArrayList<String> reponseAdresse = meteoService.obtenirAdresse(inputValue);
        String lat = reponseAdresse.get(1);
        String lon = reponseAdresse.get(2);

        ArrayList<String> reponseMeteo = meteoService.ObtenirMeteo(lat, lon);

        model.addAttribute("receivedValue", "toto");
        model.addAttribute("meteoJour1", reponseMeteo.get(1));
        model.addAttribute("tempMinJour1", reponseMeteo.get(2));
        model.addAttribute("tempMaxJour1", reponseMeteo.get(3));

        return "meteo";
    }
}
