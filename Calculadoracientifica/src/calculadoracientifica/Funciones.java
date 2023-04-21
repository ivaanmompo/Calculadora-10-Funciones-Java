/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracientifica;

import java.lang.Math;


/**
 *
 * @author jorge
 */
public class Funciones {

    private double resultado;
    
    public Funciones(){
        resultado=0;
    }
    /**
     * 
     * @param n1 El primer numero que recibe de la consola a la funcion para realizar la suma
     * @param n2 El segundo numero que recibe de la consola a la funcion para realizar la suma
     * @return Devuelve el resultado de la suma del numero n1 suamdo con el numero n2 (n1+n2)
     */
    public double suma(double n1, double n2){
        resultado = n1 + n2;
        return resultado;
    }
    /**
     * 
     * @param n1 El primer numero que recibe de la consola a la funcion para realizar la resta
     * @param n2 El segundo numero que recibe de la consola a la funcion para realizar la resta
     * @return Devuelve el resultado de la resta del numero n1 menos el numero n2 (n1-n2)
     */
     public double resta(double n1, double n2){
        resultado = n1 - n2;
        return resultado;
    }
     /**
     * 
     * @param n1 El primer numero que recibe de la consola a la funcion para realizar la multiplicacion
     * @param n2 El segundo numero que recibe de la consola a la funcion para realizar la multiplicacion
     * @return Devuelve el resultado de la multiplicacion del numero n1 por el numero n2 (n1*n2)
     */
     public double multiplicacion(double n1, double n2){
        resultado = n1 * n2;
        return resultado;
    }
      /**
     * 
     * @param n1 El primer numero que recibe de la consola a la funcion para realizar la division
     * @param n2 El segundo numero que recibe de la consola a la funcion para realizar la division
     * @return Devuelve el resultado de la division del numero n1 entre el numero n2 (n1/n2)
     */
     public double division(double n1, double n2){
        resultado = n1 / n2;
        return resultado;
    }
     /**
      * 
      * @param n1 El numero que recibe de la consola la funcion para realizar el factorial
      * @return Devuelve el resultado del factorial del numero n1
      */
     public int factorial(int n1){
        int f=1;
         for (int i = 1; i <= n1; i++) {
            f *= i;
        }
         return f;
    }
     /**
      * 
      * @param n1 El numero que recibe de la consola la funcion para realizar el elevado al cuadrado
      * @return Devuelve el resultado del numero n1 elevado al cuadrado
      */
     public double elevadocuadrado(double n1){
         resultado = Math.pow(n1,2); 
         return resultado;
     }
     /**
      * 
      * @param n1 El numero que recibe de la consola la funcion para realizar el elevado al cubo
      * @return Devuelve el resultado del numero n1 elevado al cubo
      */
     public double elevadocubo(double n1){
         resultado = Math.pow(n1,3); 
         return resultado;
     }
     /**
      * 
      * @param n1 Es el primer numero que recibe la funcion el cual quieres saber su elevado
      * @param n2 Es el segundo numero que recibe la funcion el cual va a ser el elevado del numero n1
      * @return Devuelve el numero n1 elevado al n2 
      */
     public double elevadopersonalizado(double n1, double n2){
         resultado = Math.pow(n1,n2); 
         return resultado;
     }
     /**
      * 
      * @param n1 Es el numero que recibe la funcion para calcular la raiz cuadrada 
      * @return Devuelve la raiz cuadrada del numero n1
      */
     public double raizcuadrada(double n1){
         resultado = Math.sqrt(n1);
         return resultado;
     }
     /**
      * 
      * @param n1 Es el numero que recibe la funcion para calcular la raiz cubica 
      * @return Devuelve la raiz cubica del numero n1
      */
     public double raizcubica(double n1){
         resultado = Math.cbrt(n1);
         return resultado;
     }
     
    
}
