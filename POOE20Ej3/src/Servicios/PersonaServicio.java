/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
   
    // B Metodo crearPersona(): el método crear persona, le pide los valores de 
    // los atributos al usuario y después se le asignan a sus respectivos 
    // atributos para llenar el objeto Persona. Además, comprueba que el sexo 
    // introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
    // mostrar un mensaje
    
    public Persona crearPersona() {
        System.out.print("Ingrese nombre: ");
        String nombre=leer.next();
        System.out.print("Ingrese edad: ");
        int edad=leer.nextInt();
        String sexo="_";
        int opcion;
        do {
            System.out.print("1_ Mujer\n2_Otre\n3_Hombre");
            System.out.println("Opcion:");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    sexo="M";
                    break;
                case 2:
                    sexo="O";
                    break;
                case 3:
                    sexo="H";
                    break;
                default:
                    break;
            }
        //} while (secso.("M")); 
        } while (opcion<1||opcion>3);System.out.print("Ingrese peso: ");
        double peso=leer.nextDouble();
        System.out.print("Ingrese altura: ");
        double altura=leer.nextDouble();
        Persona perS = new Persona(nombre,edad,sexo,peso,altura);
        return perS;
    }
    
    // A Método esMayorDeEdad(): indica si la persona es mayor de edad. 
    // La función devuelve un booleano.
    //    public boolean esMayorDeEdad(Persona pS){
    //        boolean esMayor=false;
    //        if (pS.getEdad()>17) {
    //            esMayor=true;
    //        }
    //        return esMayor;
    //    }
    
    public boolean esMayorDeEdad(Persona pS){
        return pS.getEdad()>17;
    }
    
    // C Método calcularIMC(): calculara si la persona está en su peso ideal 
    // (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor
    // menor que 20, significa que la persona está por debajo de su peso ideal y
    // la función devuelve un -1. Si la fórmula da por resultado un número entre
    // 20 y 25 (incluidos), significa que la persona está en su peso ideal y la 
    // función devuelve un 0. Finalmente, si el resultado de la fórmula es un 
    // valor mayor que 25 significa que la persona tiene sobrepeso, y la función
    // devuelve un 1.

    public int calcularIMC(Persona pS){
        int imc=0;
        if ((pS.getPeso())/(pS.getAltura()*pS.getAltura())<20){
            imc=-1;
        } else if ((pS.getPeso())/(pS.getAltura()*pS.getAltura())>19&&((pS.getPeso())/(pS.getAltura()*pS.getAltura())<26)){
            imc=0;
        } else {
            imc=1;
        }
        return imc;
    }
    
}
