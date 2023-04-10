package com.example.curso37.controller;


import com.example.curso37.service.PrimerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ServiceController {
        @Autowired
        @Qualifier("primerService")

        private PrimerService primerService;


        @RequestMapping("/listado")
        public String ListadoPersonas(Model model) {
            model.addAttribute("personas", primerService.getPersonas());

            return "listado";
        }
}
