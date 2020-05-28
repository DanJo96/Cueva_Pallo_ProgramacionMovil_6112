/***********************************************
 *  Programa: Suma 2 Numeros                   *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  26/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 ************************************************/
package Modelo;

public class Suma
{
    private Double num1;
    private Double num2;

    public Suma()
    {

    }

    public Suma(Double num1, Double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Suma(Double num1) {
        this.num1 = num1;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double operationsSum()
    {
        return num1+num2;
    }
}
