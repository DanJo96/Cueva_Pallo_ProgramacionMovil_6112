package Modelo;

import java.util.Date;

public class Fecha
{
    private Date fechaRecepcion;
    private Date fechaEmision;

    public Fecha()
    {

    }

    public Fecha(Date fechaRecepcion, Date fechaEmision)
    {
        this.fechaRecepcion = fechaRecepcion;
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
}
