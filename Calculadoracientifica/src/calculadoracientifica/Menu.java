/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracientifica;

import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Menu {
    
    int opcion, numero=0;
    double numero1=0, numero2=0;
    Scanner read = new Scanner (System.in);
    Funciones funciones = new Funciones();
    
    public void MostrarMenu() throws IOException{      
        do{
            System.out.println("----------CALCULADORA CIENTIFICA----------");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division");
            System.out.println("5.- Factorial");
            System.out.println("6.- Elevar al Cuadrado");
            System.out.println("7.- Elevar al Cubo");
            System.out.println("8.- Elevado Personalizado");
            System.out.println("9.- Raiz Cuadrada");
            System.out.println("10.- Raiz Cubica");
            System.out.println("11.- Salir");
            opcion = read.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("-----SUMA-----");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = read.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = read.nextDouble();
                    System.out.println("La Suma es de: " + funciones.suma(numero1, numero2));
                    System.in.read();
                    break;
                case 2:
                    System.out.println("-----RESTA-----");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = read.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = read.nextDouble();
                    System.out.println("La Resta es de: " + funciones.resta(numero1, numero2));
                    System.in.read();
                    break;
                case 3:
                    System.out.println("-----MULTIPLICACION-----");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = read.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = read.nextDouble();
                    System.out.println("El producto es de: " + funciones.multiplicacion(numero1, numero2));
                    System.in.read();
                    break;
                case 4:
                    System.out.println("-----DIVISION-----");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = read.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = read.nextDouble();
                    System.out.println("La Division es de: " + funciones.division(numero1, numero2));
                    System.in.read();
                    break;
                case 5:
                    System.out.println("-----FACTORIAL-----");
                    System.out.print("Ingrese el numero: ");
                    numero = read.nextInt();
                    System.out.println("El factorial de: " + numero + " es: " + funciones.factorial(numero));
                    System.in.read();
                    break;
                case 6:
                    System.out.println("-----Elevar 2^-----");
                    System.out.print("Ingrese el numero a elevar: ");
                    numero1 = read.nextDouble();
                    System.out.println(numero1 + " Elevado a 2^ potencia es: " + funciones.elevadocuadrado(numero1));
                    System.in.read();
                    break;
                case 7:
                    System.out.println("-----Elevar 3^-----");
                    System.out.print("Ingrese el numero a elevar: ");
                    numero1 = read.nextDouble();
                    System.out.println(numero1 + " Elevado a 3^ potencia es: " + funciones.elevadocubo(numero1));
                    System.in.read();
                    break;
                case 8:
                    System.out.println("-----Elevado Personalizado-----");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = read.nextDouble();
                    System.out.print("Ingrese la elevacion: ");
                    numero2 = read.nextDouble();
                    System.out.println(numero1 + " Elevado a" + numero2 + "^ potencia es: " + funciones.elevadopersonalizado(numero1,numero2));
                    System.in.read();
                    break;
                case 9:
                    System.out.println("-----Raiz Cuadrada-----");
                    System.out.print("Ingrese el numero: ");
                    numero1 = read.nextDouble();
                    System.out.println("La raiz cuadrada de: " + numero1 + " es: " +funciones.raizcuadrada(numero1));
                    System.in.read();
                    break;
                case 10:
                    System.out.println("-----Raiz Cubica-----");
                    System.out.print("Ingrese el numero: ");
                    numero1 = read.nextDouble();
                    System.out.println("La raiz Cubica de: " + numero1 + " 9es: " +funciones.raizcubica(numero1));
                    System.in.read();
                    break;
                case 11:
                    System.out.println("Saliendo del sistema...");
                    System.in.read();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Ingresada no valida, regresando al menu...");
                   
                    break;
            }
        }while(opcion != 11);
        
        
    }
}