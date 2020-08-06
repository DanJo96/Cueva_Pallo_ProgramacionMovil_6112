/***********************************************
 *  Programa: Chat                             *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  05/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/
package com.example.chat_cuevapallo;

import com.example.chat_cuevapallo.Modelo.Users;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    /**
     * Prueba 1.
     */
    @Test
    public void Fecha()
    {
        Users U1 = new Users();
        String control;
        String esperado = "06-Aug-2020";
        control = U1.fechaingreso();
        assertEquals(esperado,control);
    }

}