package com.ats.ats_api.dtos;

public class AtsRecapDto {
    private String fecha;
    private String hora;
    private String tipo;
    private String descripcion;
    private String monto;

    public AtsRecapDto(String fecha, String hora, String tipo, String descripcion, String monto) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
}
