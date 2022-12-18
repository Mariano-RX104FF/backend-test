package com.portfolio.yoprogramo.dto;

import javax.validation.constraints.NotBlank;

public class dtoHardSoftSkills {

    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    @NotBlank
    private String colorInicio;
    @NotBlank
    private String colorFinal;

    public dtoHardSoftSkills() {
    }

    public dtoHardSoftSkills(String nombre, int porcentaje, String colorInicio, String colorFinal) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.colorInicio = colorInicio;
        this.colorFinal = colorFinal;
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
