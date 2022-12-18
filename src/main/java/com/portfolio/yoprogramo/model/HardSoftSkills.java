package com.portfolio.yoprogramo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HardSoftSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int porcentaje;
    private String colorInicio;
    private String colorFinal;

    public HardSoftSkills() {
    }

    public HardSoftSkills(String nombre, int porcentaje, String colorInicio, String colorFinal) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.colorInicio = colorInicio;
        this.colorFinal = colorFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getColorInicio() {
        return colorInicio;
    }

    public void setColorInicio(String colorInicio) {
        this.colorInicio = colorInicio;
    }

    public String getColorFinal() {
        return colorFinal;
    }

    public void setColorFinal(String colorFinal) {
        this.colorFinal = colorFinal;
    }
    
    
    
}
