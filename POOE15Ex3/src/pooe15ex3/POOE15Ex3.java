/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ex3;

import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class POOE15Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego j1 = new Juego();
        int vuelta=0,num,jug=0,jug1=0,jug2=0;
        do {
            vuelta++;
            if (vuelta%2==0) {
                jug=2;
            } else {
                jug=1;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Juego de adivinanza de números.\n" + "Un jugador elige un número y el otro jugador intenta adivinarlo. 0 para Salir.");
            System.out.println("");
            System.out.print("Jugador " + jug + " ingresá un número: ");
            num=new Scanner(System.in).nextInt();
            j1.iniciarJuego(num,jug);
            if (jug==1) {
                jug1++;
            } else {
                jug2++;
            }
        } while (num!=0);
        System.out.println("");
        System.out.println("Jugador 1: " + jug1 + " puntos");
        System.out.println("Jugador 2: " + jug2 + " puntos");
    }
}
