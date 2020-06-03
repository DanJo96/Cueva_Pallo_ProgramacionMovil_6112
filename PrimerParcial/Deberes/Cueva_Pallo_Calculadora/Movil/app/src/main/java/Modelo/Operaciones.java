/***********************************************
 *  Programa: Suma 2 Numeros                   *
 *	Autores: Cueva - Pallo					   *
 *	Fecha Creación: 26/05/2020				   *
 *	Fecha Modificación:  26/05/2020		       *
 *	Carrera: Sistemas e Informatica			   *
 *	Profesor: Ing Fernando Solis			   *
 **********************************************/

package Modelo;

/**
 * The type Operaciones.
 */
public class Operaciones {
    private double numero1;
    private double numero2;
    private double M=0;
    /**
     * The Operador.
     */
    String operador;

    /**
     * Instantiates a new Operaciones.
     */
    public Operaciones() {

    }

    public double getM() {
        return M;
    }

    public void setM(double m) {
        M = m;
    }

    /**
     * Gets numero 1.
     *
     * @return the numero 1
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * Sets numero 1.
     *
     * @param numero1 the numero 1
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * Gets numero 2.
     *
     * @return the numero 2
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * Sets numero 2.
     *
     * @param numero2 the numero 2
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
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
     * @return the double
     */
    public Double realizarOperacion(){
        double resultado=0;
        if(operador.equals("+")){
            resultado = operationsSum(numero1,numero2);
            numero1=resultado;
        }
        if(operador.equals("-")){
            resultado = operationsRes(numero1,numero2);
            numero1=resultado;
        }
        if(operador.equals("*")){
            resultado =operationsMul(numero1,numero2);
            numero1=resultado;
        }
        if(operador.equals("/")){

                resultado =operationsDiv(numero1,numero2);
                numero1=resultado;

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
    public void operacionMP(){
        M=operationsSum(M,numero1);
    }
    public void operacionMN(){
        M=operationsRes(M,numero1);
    }


}
