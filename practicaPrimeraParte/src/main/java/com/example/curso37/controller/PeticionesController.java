package com.example.curso37.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PeticionesController {


    // http://localhost:8080/peticiones1?nombre=Juan
    @GetMapping("/peticiones1")
    public ModelAndView Peticion1(@RequestParam(name = "nombre") String nom) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("nombre", nom);
        return mav;
    }

    // http://localhost:8080/peticiones2/nombre
    @GetMapping("/peticiones2/{nombre}")
    public ModelAndView Peticion2(@PathVariable(name = "nombre") String nom) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("nombre", nom);
        return mav;
    }


}
