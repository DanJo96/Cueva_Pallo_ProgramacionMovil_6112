package com.example.chat_cuevapallo.Modelo;

/**
 * The type Users.
 */
public class Users
{
    private String id;
    private String nombre;
    private String mail;
    private String foto;
    private String estado;
    private String fecha;
    private String hora;
    private int solicitudes;
    private int nuevomensaje;

    /**
     * Instantiates a new Users.
     */
    public Users() {
    }

    /**
     * Instantiates a new Users.
     *
     * @param id           the id
     * @param nombre       the nombre
     * @param mail         the mail
     * @param foto         the foto
     * @param estado       the estado
     * @param fecha        the fecha
     * @param hora         the hora
     * @param solicitudes  the solicitudes
     * @param nuevomensaje the nuevomensaje
     */
    public Users(String id, String nombre, String mail, String foto, String estado, String fecha, String hora, int solicitudes, int nuevomensaje) {
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.foto = foto;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
        this.solicitudes = solicitudes;
        this.nuevomensaje = nuevomensaje;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets mail.
     *
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets mail.
     *
     * @param mail the mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Gets foto.
     *
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Sets foto.
     *
     * @param foto the foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * Gets estado.
     *
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets estado.
     *
     * @param estado the estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Gets fecha.
     *
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets fecha.
     *
     * @param fecha the fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Gets hora.
     *
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * Sets hora.
     *
     * @param hora the hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Gets solicitudes.
     *
     * @return the solicitudes
     */
    public int getSolicitudes() {
        return solicitudes;
    }

    /**
     * Sets solicitudes.
     *
     * @param solicitudes the solicitudes
     */
    public void setSolicitudes(int solicitudes) {
        this.solicitudes = solicitudes;
    }

    /**
     * Gets nuevomensaje.
     *
     * @return the nuevomensaje
     */
    public int getNuevomensaje() {
        return nuevomensaje;
    }

    /**
     * Sets nuevomensaje.
     *
     * @param nuevomensaje the nuevomensaje
     */
    public void setNuevomensaje(int nuevomensaje) {
        this.nuevomensaje = nuevomensaje;
    }
}
