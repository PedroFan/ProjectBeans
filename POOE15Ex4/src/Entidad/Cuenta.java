/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * 
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después 
 * de realizar una transacción de retiro.
 * 
 * @author Josefina
 */
public class Cuenta {
    private String titular;
    private double saldo;
    
    public Cuenta () {
    }
    
    public Cuenta (String titular, double saldo) {
        this.titular=titular;
        this.saldo=saldo;
    }
    
    public double getSaldo () {
        return this.saldo;
    }
    public int retirarDinero () {
        int retiro=0;
        do {
            System.out.println("¿Cuánto dinero desea retirar?");
            retiro=new Scanner(System.in).nextInt();
        } while (retiro>this.saldo);
        this.saldo-=retiro;
        return retiro;
    }
}
