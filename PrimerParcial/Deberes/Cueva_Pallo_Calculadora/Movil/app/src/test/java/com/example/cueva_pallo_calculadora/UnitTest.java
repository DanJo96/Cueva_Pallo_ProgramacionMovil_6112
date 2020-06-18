
/***********************************************
 *  Programa: Calculadora Básica               *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  05/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/

package com.example.cueva_pallo_calculadora;

import org.junit.Test;

import Modelo.Operaciones;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest
{
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
    public void sumaDosNumeros()
    {
        Operaciones PO1 = new Operaciones();
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
        Operaciones PO2 = new Operaciones();
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
        Operaciones PO3= new Operaciones();
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
        Operaciones PO4 = new Operaciones();
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
        Operaciones PO5 = new Operaciones();
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
        Operaciones PO6 = new Operaciones();
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
        Operaciones PO7 = new Operaciones();
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
        Operaciones PO8 = new Operaciones();
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
        Operaciones PO9 = new Operaciones();
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
        Operaciones PO10 = new Operaciones();
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
        Operaciones PO11 = new Operaciones();
        assertEquals(null, PO11.operationsDiv(8,0));
    }

    /**
     * PU12: Factorial.
     */
    @Test
    public void factorial()
    {
        Operaciones PO12 = new Operaciones();
        double control;
        double esperado= 6;
        control = PO12.operationsFact(3);
        assertEquals(esperado, control, 0.0);
    }

    /**
     * PU13: Potencia.
     */
    @Test
    public void potencia()
    {
        Operaciones PO13 = new Operaciones();
        double control;
        double esperado= 9;
        control = PO13.operationsPot(3,2);
        assertEquals(esperado, control, 0.0);
    }


    /**
     * PU14: Raiz.
     */
    @Test
    public void raiz()
    {
        Operaciones PO14 = new Operaciones();
        double control;
        double esperado= 5;
        control = PO14.operationsRai(25.0);
        assertEquals(esperado, control, 0.0);
    }

    /**
     * PU15: Logaritmo.
     */
    @Test
    public void logaritmo()
    {
        Operaciones PO15 = new Operaciones();
        double control;
        double esperado= 3.2188758248680425;
        control = PO15.operationsLn(25.0);
        assertEquals(esperado, control, 0.0);
    }

    /**
     * PU16: Seno.
     */
    @Test
    public void seno()
    {
        Operaciones PO16 = new Operaciones();
        double control;
        double esperado= 0.5;
        control = PO16.operationsSin(30.0);
        assertEquals(esperado, control, 0.0);
    }

    /**
     * PU17: Coseno.
     */
    @Test
    public void coseno()
    {
        Operaciones PO17 = new Operaciones();
        double control;
        double esperado= 0.8660254;
        control = PO17.operationsCos(30.0);
        assertEquals(esperado, control, 0.0);
    }

    /**
     * PU18: Binario.
     */
    @Test
    public void binario()
    {
        Operaciones PO18 = new Operaciones();
        String control;
        String esperado= "1010";
        control = PO18.operationsDecBin(10);
        assertEquals(esperado, control);
    }

    /**
     * PU19: Octal.
     */
    @Test
    public void octal()
    {
        Operaciones PO19 = new Operaciones();
        String control;
        String esperado= "12";
        control = PO19.operationsDecOct(10);
        assertEquals(esperado, control);
    }

    /**
     * PU20: Hexadecimal.
     */
    @Test
    public void hexadecimal()
    {
        Operaciones PO20 = new Operaciones();
        String control;
        String esperado= "A";
        control = PO20.operationsDecHex(10);
        assertEquals(esperado, control);
    }

}