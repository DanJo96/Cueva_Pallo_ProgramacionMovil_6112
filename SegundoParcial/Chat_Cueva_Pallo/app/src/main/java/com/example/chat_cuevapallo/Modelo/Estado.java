/***********************************************
 *  Programa: Chat                             *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  05/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/
package com.example.chat_cuevapallo.Modelo;

/**
 * The type Estado.
 */
public class Estado
{
    /**
     * The Estado.
     */
    String estado;
    /**
     * The Fecha.
     */
    String fecha;
    /**
     * The Hora.
     */
    String hora;
    /**
     * The Chatcon.
     */
    String chatcon;

    /**
     * Instantiates a new Estado.
     */
    public Estado() {
    }

    /**
     * Instantiates a new Estado.
     *
     * @param estado  the estado
     * @param fecha   the fecha
     * @param hora    the hora
     * @param chatcon the chatcon
     */
    public Estado(String estado, String fecha, String hora, String chatcon) {
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
        this.chatcon = chatcon;
    }

    /**
     * Gets chatcon.
     *
     * @return the chatcon
     */
    public String getChatcon() {
        return chatcon;
    }

    /**
     * Sets chatcon.
     *
     * @param chatcon the chatcon
     */
    public void setChatcon(String chatcon) {
        this.chatcon = chatcon;
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
}
