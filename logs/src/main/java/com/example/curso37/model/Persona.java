package com.example.curso37.model;

public class Persona {
    // Atributos nombre y apellido
    private String nombre;
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona() {
    }
}
