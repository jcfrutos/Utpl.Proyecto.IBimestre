package com.ats.ats_api.model;

public class AtsRendimiento {
    private Long id;
    private String descripcion;
    private Double rendimiento;

    public AtsRendimiento() {
    }

    public AtsRendimiento(Long id, String descripcion, Double rendimiento) {
        this.id = id;
        this.descripcion = descripcion;
        this.rendimiento = rendimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Double rendimiento) {
        this.rendimiento = rendimiento;
    }
    
}
