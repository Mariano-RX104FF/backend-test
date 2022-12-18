package com.portfolio.yoprogramo.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class dtoProyectos {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String img;
    @NotBlank
    private String link;
    @NotBlank
    private String categoria;
    @NotBlank
    private String fecha;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombre, String descripcion, String img, String link, String categoria, String fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.link = link;
        this.categoria = categoria;
        this.fecha = fecha;
    }
    
}
