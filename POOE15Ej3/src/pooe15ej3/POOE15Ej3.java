/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ej3;

import Entidad.Operacion;
import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 
 * y numero2. A continuación, se deben crear los siguientes métodos:
 * Método constructor con todos los atributos pasados por parámetro.
 * Método constructor sin los atributos pasados por parámetro.
 * Métodos get y set.
 * Método para crearOperacion(): que le pide al usuario los dos números y los 
 * guarda en los atributos del objeto.
 * Método sumar(): calcular la suma de los números y devolver el resultado al 
 * main.
 * Método restar(): calcular la resta de los números y devolver el resultado al 
 * main
 * Método multiplicar(): primero valida que no se haga una multiplicación por 
 * cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa 
 * al usuario el error. Si no, se hace la multiplicación y se devuelve el 
 * resultado al main
 * Método dividir(): primero valida que no se haga una división por cero, si 
 * fuera a pasar una división por cero, el método devuelve 0 y se le informa al 
 * usuario el error se le informa al usuario. Si no, se hace la división y se 
 * devuelve el resultado al main.
 * 
 * @author Josefina
 */
public class POOE15Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Operacion op1 = new Operacion();
        double num1=0;
        
        System.out.println("Ingrese el primer número: ");
        num1=leer.nextDouble();
        
        System.out.println("Ingrese el segundo número: ");
        op1.crearOperacion(num1, leer.nextDouble());
        
        System.out.println("");
        System.out.println("0) Salir ");
        System.out.println("1) Sumar ");
        System.out.println("2) Restar ");
        System.out.println("3) Multiplicar ");
        System.out.println("4) Dividir ");
        System.out.println("");
        System.out.print("Seleccione la operación: ");
        switch (leer.nextInt()) {
            case 0:
                break;
            case 1:
                System.out.println("" + op1.sumar());
                break;
            case 2:
                System.out.println("" + op1.restar());
                break;
            case 3:
                System.out.println("" + op1.multiplicar());
                break;
            case 4:
                System.out.println("" + op1.dividir());
                break;
            default:
        }
    }
}
