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
 * The type Solicitudes.
 */
public class Solicitudes
{
    /**
     * The Estado.
     */
    String estado;
    /**
     * The Idchat.
     */
    String idchat;

    /**
     * Instantiates a new Solicitudes.
     */
    public Solicitudes() {
    }

    /**
     * Instantiates a new Solicitudes.
     *
     * @param estado the estado
     * @param idchat the idchat
     */
    public Solicitudes(String estado, String idchat) {
        this.estado = estado;
        this.idchat = idchat;
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
     * Gets idchat.
     *
     * @return the idchat
     */
    public String getIdchat() {
        return idchat;
    }

    /**
     * Sets idchat.
     *
     * @param idchat the idchat
     */
    public void setIdchat(String idchat) {
        this.idchat = idchat;
    }
}
