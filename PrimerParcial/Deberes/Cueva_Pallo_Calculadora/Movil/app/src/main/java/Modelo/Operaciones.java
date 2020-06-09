/***********************************************
 *  Programa: Calculadora Básica               *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  05/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/
package Modelo;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.math.*;

/**
 * The type Operaciones.
 */
public class Operaciones
{
    private Numero numero;
    private double M=0;
    /**
     * The Operador.
     */
    String operador;

    /**
     * Instantiates a new Operaciones.
     */
    public Operaciones() {
        numero = new Numero();
    }

    /**
     * Gets numero.
     *
     * @return the numero
     */
    public Numero getNumero() {
        return numero;
    }

    /**
     * Sets numero.
     *
     * @param numero the numero
     */
    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    /**
     * Gets m.
     *
     * @return the m
     */
    public double getM() {
        return M;
    }

    /**
     * Sets m.
     *
     * @param m the m
     */
    public void setM(double m) {
        M = m;
    }

    /**
     * Gets operador.
     *
     * @return the operador
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Sets operador.
     *
     * @param operador the operador
     */
    public void setOperador(String operador) {
        this.operador = operador;
    }

    /**
     * Realizar operacion double.
     *
     * @param numero2 the numero 2
     * @return the double
     */

    @RequiresApi(api = Build.VERSION_CODES.N)
    public Double realizarOperacion(Double numero2)
    {
        double resultado=0;
        if(operador.equals("+"))
        {
            resultado = operationsSum(numero.getValor(),numero2);
            numero.setValor(resultado);
        }
        if(operador.equals("-"))
        {
            resultado = operationsRes(numero.getValor(),numero2);
            numero.setValor(resultado);
        }
        if(operador.equals("*"))
        {
            resultado =operationsMul(numero.getValor(),numero2);
            numero.setValor(resultado);
        }
        if(operador.equals("/"))
        {
            resultado =operationsDiv(numero.getValor(),numero2);
            numero.setValor(resultado);
        }
        if(operador.equals("^"))
        {
            resultado =operationsPot(numero.getValor(),numero2);
            numero.setValor(resultado);
        }
        if(operador.equals("%"))
        {
            resultado = operationsMod(numero.getValor(),numero2);
            numero.setValor(resultado);
        }
        return resultado;
    }

    /**
     * Operations sum double.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the double
     */
    public Double operationsSum(double num1, double num2)
    {

        try{
            return num1 + num2;
        }catch (Exception e){

        }
        return null;
    }

    /**
     * Operations res double.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the double
     */
    public Double operationsRes(double num1, double num2)
    {
        try
        {
            return num1 - num2;
        }
        catch (Exception e)
        {

        }
        return null;
    }

    /**
     * Operations mul double.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the double
     */
    public Double operationsMul(double num1, double num2)
    {
        try
        {
            return num1 * num2;
        }
        catch (Exception e)
        {

        }
        return null;
    }

    /**
     * Operations div double.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the double
     */
    public Double operationsDiv(double num1, double num2)
    {
        try
        {
            if (num2==0)
            {
                return null;
            }
            else
                return num1 / num2;
        }
        catch (Exception e)
        {

        }
        return null;
    }

    /**
     * Operacion mp.
     */
    public void operacionMP()
    {
        M=operationsSum(M,numero.getValor());
    }

    /**
     * Operacion mn.
     */
    public void operacionMN()
    {
        M=operationsRes(M,numero.getValor());
    }

    /**
     * Operations fact double.
     *
     * @param num1 the num 1
     * @return the double
     */
    public Double operationsFact(double num1)
    {
        double acumulador = 1;
        try
        {
            for(int i=2; i<=num1; i++)
            {
                acumulador = acumulador * i;
            }
        }
        catch (Exception e)
        {

        }

        return acumulador;
    }

    /**
     * Operations pot double.
     *
     * @param base      the base
     * @param exponente the exponente
     * @return the double
     */
    public Double operationsPot(double base, double exponente)
    {
        double acumPot=1;
        try
        {
            for(int i=0; i<exponente; i++)
            {
                acumPot*=base;
            }
            return acumPot;
        }
        catch (Exception e)
        {

        }
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public Double operationsMod(Double num1, Double num2)
    {
        try
        {
            Integer aux=Math.floorMod(num1.intValue(),num2.intValue());
            return aux.doubleValue();
        }
        catch (Exception e)
        {

        }
        return null;
    }

}
