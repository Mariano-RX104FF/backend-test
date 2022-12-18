package com.portfolio.yoprogramo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private String img;
    private String link;
    private String categoria;
    private String fecha;

    public Proyectos() {
    }

    public Proyectos(String nombre, String descripcion, String img, String link, String categoria, String fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.link = link;
        this.categoria = categoria;
        this.fecha = fecha;
    }
    
}
