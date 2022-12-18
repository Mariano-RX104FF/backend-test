package com.portfolio.yoprogramo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la condición")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la condición")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la condición")
    private String descripcion;

    @NotNull
    private String titulo;
    private String img;
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String titulo, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.img = img;
    }
    
}
