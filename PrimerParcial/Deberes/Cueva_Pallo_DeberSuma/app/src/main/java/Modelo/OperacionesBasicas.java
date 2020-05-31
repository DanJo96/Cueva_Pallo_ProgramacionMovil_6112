/***********************************************
 *  Programa: Suma 2 Numeros                   *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  26/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 ************************************************/
package Modelo;

/**
 * The type Operaciones basicas.
 */
public class OperacionesBasicas
{
    private Double num1;
    private Double num2;

    /**
     * Instantiates a new Operaciones basicas.
     */
    public OperacionesBasicas()
    {

    }

    /**
     * Instantiates a new Operaciones basicas.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     */
    public OperacionesBasicas(Double num1, Double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Instantiates a new Operaciones basicas.
     *
     * @param num1 the num 1
     */
    public OperacionesBasicas(Double num1) {
        this.num1 = num1;
    }

    /**
     * Gets num 1.
     *
     * @return the num 1
     */
    public Double getNum1() {
        return num1;
    }

    /**
     * Sets num 1.
     *
     * @param num1 the num 1
     */
    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    /**
     * Gets num 2.
     *
     * @return the num 2
     */
    public Double getNum2() {
        return num2;
    }

    /**
     * Sets num 2.
     *
     * @param num2 the num 2
     */
    public void setNum2(Double num2) {
        this.num2 = num2;
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
    public Double operationsRes(double num1, double num2) {
        try{
            return num1 - num2;
        }catch (Exception e){

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
    public Double operationsMul(double num1, double num2) {
        try{
            return num1 * num2;
        }catch (Exception e){

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
    public Double operationsDiv(double num1, double num2) {
        try{
            if (num2==0){
                return null;
            }
            else
                return num1 / num2;
        }catch (Exception e){

        }
        return null;
    }
}
