/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ex2;

import Entidad.Punto;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class POOE15Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1,y1,x2,y2;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese coordenadas");
        System.out.print("X 1: ");
        x1=leer.nextInt();
        System.out.print("Y 1: ");
        y1=leer.nextInt();
        System.out.print("X 2: ");
        x2=leer.nextInt();
        System.out.print("Y 2: ");
        y2=leer.nextInt();
        Punto p1 =new Punto();
        p1.crearPuntos(x1, y1, x2, y2);
        System.out.println(p1);
        System.out.println("");
        System.out.println("La distancia entre las coordenadas es: " + p1.distancia());
    }
}
