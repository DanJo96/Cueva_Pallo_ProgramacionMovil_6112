/***********************************************
 *  Programa: Suma 2 Numeros                   *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  26/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/

package com.example.cueva_pallo_debersuma;
import org.junit.Test;
import Modelo.OperacionesBasicas;
import static org.junit.Assert.*;

public class PruebasUnitariasCalculadora
{

    /**
     * PU1: Suma dos números.
     */
    @Test
    public void sumaDosNumeros()
    {
        OperacionesBasicas PO1 = new OperacionesBasicas();
        double control;
        double esperado=6;
        control=PO1.operationsSum(2,4);
        assertEquals(esperado, control,0.0);
    }

    /**
     * PU2: Suma de números negativos.
     */
    @Test
    public void sumaDosNumerosNegativos()
    {
        OperacionesBasicas PO2 = new OperacionesBasicas();
        double control;
        double esperado=-6.7;
        control=PO2.operationsSum(-3.2,-3.5);
        assertEquals(esperado, control,0.0);
    }
    /**
     * PU3: Resta dos números.
     */
    @Test
    public void restaDosNumeros()
    {
        OperacionesBasicas PO3= new OperacionesBasicas();
        double control;
        double esperado=-2;
        control=PO3.operationsRes(1,3);
        assertEquals(esperado, control,0.0);
    }

    /**
     * PU4: Resta dos números negativos.
     */
    @Test
    public void restaDosNumerosNegativos()
    {
        OperacionesBasicas PO4 = new OperacionesBasicas();
        double control;
        double esperado=-2.2;
        control=PO4.operationsRes(-5.2,-3);
        assertEquals(esperado, control, 0.0);
    }

    /**
     * PU5: Multiplicación dos números.
     */
    @Test
    public void multiplicacionDosNumeros()
    {
        OperacionesBasicas PO5 = new OperacionesBasicas();
        double control;
        double esperado=0;
        control=PO5 .operationsMul(6,0);
        assertEquals(esperado, control,0.0);
    }

    /**
     * PU6: Multiplicación dos números negativos.
     */
    @Test
    public void multiplicacionDosNumerosNegativos()
    {
        OperacionesBasicas PO6 = new OperacionesBasicas();
        double control;
        double esperado=20;
        control=PO6 .operationsMul(-4,-5);
        assertEquals(esperado, control,0.0);
    }
    /**
     * PU7: Multiplicación un número positivo y negativo.
     */
    @Test
    public void multiplicacionDosNumerosPosNeg()
    {
        OperacionesBasicas PO7 = new OperacionesBasicas();
        double control;
        double esperado= -15;
        control=PO7 .operationsMul(3,-5);
        assertEquals(esperado, control,0.0);
    }
    /**
     * PU8: División de dos números.
     */
    @Test
    public void divisionDosNumeros()
    {
        OperacionesBasicas PO8 = new OperacionesBasicas();
        double control;
        double esperado=0.25;
        control=PO8.operationsDiv(1,4);
        assertEquals(esperado, control,0.0);
    }

    /**
     * PU9: División de dos números.
     */
    @Test
    public void divisionDosNumerosNegativos()
    {
        OperacionesBasicas PO9 = new OperacionesBasicas();
        double control;
        double esperado=0.25;
        control=PO9.operationsDiv(-1,-4);
        assertEquals(esperado, control,0.0);
    }

    /**
     * PU10: División de un número positivo y negativo.
     */
    @Test
    public void divisionDosNumerosPosNeg()
    {
        OperacionesBasicas PO10 = new OperacionesBasicas();
        double control;
        double esperado=-0.25;
        control=PO10.operationsDiv(1,-4);
        assertEquals(esperado, control,0.0);
    }

    /**
     * PU11: División para 0.
     */
    @Test
    public void divisionPara0()
    {
        OperacionesBasicas PO11 = new OperacionesBasicas();
        assertEquals(null, PO11.operationsDiv(8,0));
    }





}