package com.example.curso37.model;

public class Persona {
    private String nombre;
    private String telefono;

    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String telefono) {
        super();
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
