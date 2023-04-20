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
    
    // constructor crearPerona
    // Metodo crearPersona(): el método crear persona, le pide los valores de 
    // los atributos al usuario y después se le asignan a sus respectivos 
    // atributos para llenar el objeto Persona. Además, comprueba que el sexo 
    // introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
    // mostrar un mensaje
    public Persona crearPersona() {
        String secso;
        int opcion;
        Persona perso = new Persona();
        System.out.print("Ingrese nombre: ");
        perso.setNombre(leer.next());
        System.out.print("Ingrese edad: ");
        perso.setEdad(leer.nextByte());
        do {
            System.out.print("1_ Mujer\n2_Otre\n3_Hombre");
            System.out.println("Opcion:");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    perso.setSexo("M");
                    break;
                case 2:
                    perso.setSexo("O");
                    break;
                case 3:
                    perso.setSexo("H");
                    break;
                default:
                    break;
            }
        //} while (secso.("M")); 
        } while (opcion<1||opcion>3);
        System.out.print("Ingrese peso (en kg): ");
        perso.setPeso(leer.nextDouble());
        System.out.print("Ingrese altura (en cm): ");
        perso.setAltura(leer.nextDouble());
        return perso;
    }
    
    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La 
    // función devuelve un booleano.
    public boolean esMayorDeEdad(Persona pN) {
        if (pN.getEdad()>=18)
            return true;
        else
            return false;
    }
    
    // Método calcularIMC(): calculara si la persona está en su peso ideal 
    // (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un 
    // valor menor que 20, significa que la persona está por debajo de su peso 
    // ideal y la función devuelve un -1. Si la fórmula da por resultado un 
    // número entre 20 y 25 (incluidos), significa que la persona está en su 
    // peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
    // fórmula es un valor mayor que 25 significa que la persona tiene 
    // sobrepeso, y la función devuelve un 1.
    public int calcularIMC(Persona pN) {
        int imc=0;
        if ((pN.getPeso()/(pN.getAltura()*pN.getAltura()))<20) {
            imc=-1;
        } else if ((pN.getPeso()/(pN.getAltura()*pN.getAltura()))>25) {
            imc=1;
        } else {
            imc=0;
        }
        return imc;
    }
    
    public Persona crearPersona(Persona pS) {
        String secso;
        int opcion;
        Persona perso = new Persona();
        System.out.print("Ingrese nombre: ");
        perso.setNombre(leer.next());
        System.out.print("Ingrese edad: ");
        perso.setEdad(leer.nextByte());
        do {
            System.out.print("1_ Mujer\n2_Otre\n3_Hombre");
            System.out.println("Opcion:");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    perso.setSexo("M");
                    break;
                case 2:
                    perso.setSexo("O");
                    break;
                case 3:
                    perso.setSexo("H");
                    break;
                default:
                    break;
            }
        //} while (secso.("M")); 
        } while (opcion<1||opcion>3);
        System.out.print("Ingrese peso (en kg): ");
        perso.setPeso(leer.nextDouble());
        System.out.print("Ingrese altura (en cm): ");
        perso.setAltura(leer.nextDouble());
        return perso;
    }
}
