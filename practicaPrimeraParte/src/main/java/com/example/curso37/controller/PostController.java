package com.example.curso37.controller;

import com.example.curso37.model.Persona;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PostController {

    @GetMapping("/form")
    public String Form(Model model)
    {
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/form/addPersona")
    public ModelAndView Resultados(@ModelAttribute("persona") Persona persona)
    {
        ModelAndView mav = new ModelAndView("resultados");
        mav.addObject("persona", persona);
        return mav;
    }


    //formas de hacer redireccion
    @GetMapping("/redireccion1")
    public String Redireccion1()
    {
        return "redirect:/form";
    }

}
