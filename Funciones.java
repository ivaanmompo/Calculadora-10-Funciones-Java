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
    
    public double suma(double n1, double n2){
        resultado = n1 + n2;
        return resultado;
    }
    
     public double resta(double n1, double n2){
        resultado = n1 - n2;
        return resultado;
    }
     
     public double multiplicacion(double n1, double n2){
        resultado = n1 * n2;
        return resultado;
    }
     
     public double division(double n1, double n2){
        resultado = n1 / n2;
        return resultado;
    }
     
     public int factorial(int n1){
        int f=1;
         for (int i = 1; i <= n1; i++) {
            f *= i;
        }
         return f;
    }
     
     public double elevadocuadrado(double n1){
         resultado = Math.pow(n1,2); 
         return resultado;
     }
     
     public double elevadocubo(double n1){
         resultado = Math.pow(n1,3); 
         return resultado;
     }
     
     public double elevadopersonalizado(double n1, double n2){
         resultado = Math.pow(n1,n2); 
         return resultado;
     }
     public double raizcuadrada(double n1){
         resultado = Math.sqrt(n1);
         return resultado;
     }
     
     public double raizcubica(double n1){
         resultado = Math.cbrt(n1);
         return resultado;
     }
     
    
}
