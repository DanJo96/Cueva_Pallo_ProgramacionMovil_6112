/***********************************************
 *  Programa: Suma 2 Numeros                   *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  26/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 ************************************************/

package com.example.cueva_pallo_debersuma;

import org.junit.Test;

import Modelo.OperacionesBasicas;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /**
     * Addition is correct.
     */
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /**
     * Suma dos numeros.
     */
    @Test
    public void sumaDosNumeros() {
        OperacionesBasicas op = new OperacionesBasicas();
        double control;
        double esperado=6;
        control=op.operationsSum(2,4);
        assertEquals(esperado, control,2);
    }

    /**
     * Resta dos numeros.
     */
    @Test
    public void restaDosNumeros() {
        OperacionesBasicas op = new OperacionesBasicas();
        double control;
        double esperado=-1;
        control=op.operationsRes(1,2);
        assertEquals(esperado, control,2);
    }

    /**
     * Mult dos numeros.
     */
    @Test
    public void multDosNumeros() {
        OperacionesBasicas op = new OperacionesBasicas();
        double control;
        double esperado=0;
        control=op.operationsMul(6,0);
        assertEquals(esperado, control,2);
    }

    /**
     * Div dos numeros.
     */
    @Test
    public void divDosNumeros() {
        OperacionesBasicas op = new OperacionesBasicas();
        double control;
        double esperado=0.25;
        control=op.operationsDiv(1,4);
        assertEquals(esperado, control,2);
    }

    /**
     * Div para 0.
     */
    @Test
    public void divPara0() {
        OperacionesBasicas op = new OperacionesBasicas();
        assertEquals(null, op.operationsDiv(8,0));
    }

}