package com.ats.ats_api.model;

public class AtsAnulado {
    private Long id;
    private String motivoAnulacion;
    private String fechaAnulacion;

    // Constructor
    public AtsAnulado(Long id, String motivoAnulacion, String fechaAnulacion) {
        this.id = id;
        this.motivoAnulacion = motivoAnulacion;
        this.fechaAnulacion = fechaAnulacion;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public String getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(String fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }
    
}
