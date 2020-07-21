package Modelo;

public class Mensaje
{
    private String mensaje;
    private boolean estado;
    private String hora;
    private Fecha fecha;

    public Mensaje()
    {
        fecha = new Fecha();
    }

    public Mensaje(String mensaje, boolean estado, String hora, Fecha fecha)
    {
        this.mensaje = mensaje;
        this.estado = estado;
        this.hora = hora;
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
