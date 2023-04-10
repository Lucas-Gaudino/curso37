package com.example.curso37.serviceImpl;

//immportar personas y list
import com.example.curso37.model.Persona;

import java.util.ArrayList;
import java.util.List;
import com.example.curso37.service.PrimerService;
import org.springframework.stereotype.Service;

@Service("primerService")
public class primerServiceImp implements PrimerService {

    @Override
    public List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Perez"));
        personas.add(new Persona("Maria", "Gomez"));


        return personas;
    }
}
