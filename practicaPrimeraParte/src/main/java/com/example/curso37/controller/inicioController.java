package com.example.curso37.controller;


import com.example.curso37.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class inicioController {

    @GetMapping("/metodo1")
    public String Metodo1(Model model) {
        model.addAttribute("persona", getPersonas());

        return "personas";
    }

    @GetMapping("/metodo2")
    public ModelAndView Metodo2() {
        ModelAndView mav = new ModelAndView("metodo2");
        mav.addObject("nombre", "Hola mundo 2");
        return mav;
    }

    private List<Persona> getPersonas() {
        List<Persona> personas = List.of(
                new Persona("Juan", "123456789"),
                new Persona("Pedro", "987654321"),
                new Persona("Maria", "123456789"),
                new Persona("Jose", "987654321")
        );
        return personas;
    }
}
