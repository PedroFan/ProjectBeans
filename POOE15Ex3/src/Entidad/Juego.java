/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
 * después de cada intento. El juego termina cuando el segundo jugador adivina 
 * el número o se queda sin intentos. Registra el número de intentos necesarios 
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 * 
 * @author Josefina
 */

public class Juego {
    private int numero;
    private int jugador;
    
    public void iniciarJuego(int numero,int jugador) {
        this.numero=numero;
        if (jugador==1){
            this.jugador=2;
        } else {
            this.jugador=1;
        }
        int intento, intentos=0;
        do {
            System.out.print("Jugador " + this.jugador + ", adiviná el número: ");
            intento=new Scanner(System.in).nextInt();
            if (intento>this.numero) {
                System.out.println("Es menor que el introducido.");
            } else if (intento<this.numero) {
                System.out.println("Es mayor que el introducido.");
            } else {
                System.out.println("¡Acertaste!");
            }
            intentos++;
        } while(intento!=this.numero);
        System.out.println("¡Felicidades, jugador " + this.jugador + "! Lo lograste en " + intentos + " intentos.");
    }
}
