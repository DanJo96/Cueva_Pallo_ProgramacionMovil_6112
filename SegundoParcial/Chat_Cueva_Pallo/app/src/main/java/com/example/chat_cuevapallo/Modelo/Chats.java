package com.example.chat_cuevapallo.Modelo;

/**
 * The type Chats.
 */
public class Chats
{
    private String envia;
    private String recibe;
    private String mensaje;
    private String visto;

    /**
     * Instantiates a new Chats.
     */
    public Chats() {
    }

    /**
     * Instantiates a new Chats.
     *
     * @param envia   the envia
     * @param recibe  the recibe
     * @param mensaje the mensaje
     * @param visto   the visto
     */
    public Chats(String envia, String recibe, String mensaje, String visto) {
        this.envia = envia;
        this.recibe = recibe;
        this.mensaje = mensaje;
        this.visto = visto;
    }

    /**
     * Gets envia.
     *
     * @return the envia
     */
    public String getEnvia() {
        return envia;
    }

    /**
     * Sets envia.
     *
     * @param envia the envia
     */
    public void setEnvia(String envia) {
        this.envia = envia;
    }

    /**
     * Gets recibe.
     *
     * @return the recibe
     */
    public String getRecibe() {
        return recibe;
    }

    /**
     * Sets recibe.
     *
     * @param recibe the recibe
     */
    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    /**
     * Gets mensaje.
     *
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets mensaje.
     *
     * @param mensaje the mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Gets visto.
     *
     * @return the visto
     */
    public String getVisto() {
        return visto;
    }

    /**
     * Sets visto.
     *
     * @param visto the visto
     */
    public void setVisto(String visto) {
        this.visto = visto;
    }
}
