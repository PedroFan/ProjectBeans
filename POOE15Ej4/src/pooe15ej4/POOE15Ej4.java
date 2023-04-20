/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ej4;

import Entidad.Rectangulo;
import Entidad.Rectangulo2;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class POOE15Ej4 {

    /**
     * @param args the command line arguments
     */
 /*   public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese base: ");
        double base=leer.nextDouble();
        System.out.print("Ingrese altura: ");
        Rectangulo r1 = new Rectangulo(base,leer.nextDouble());
        System.out.println("");
        System.out.println("La superficie del rectángulo es: " + r1.superficie());
        System.out.println("El perímetro del rectángulo es: " + r1.perimetro());
        System.out.println("");
        r1.dibuja();
    }
}
*/
    
public static void main(String[] args) {
    
    System.out.println("Ingrese base: ");
    double b=new Scanner(System.in).nextDouble();
    System.out.println("Ingrese altura: ");
    double h=new Scanner(System.in).nextDouble();
    Rectangulo2 r2 = new Rectangulo2(b,h);
    System.out.println("r2.base: " + r2.getBase() + " - r2.altura: " + r2.getAltura());
    System.out.println("Area: " + r2.Area() + " - Perimetro: " + r2.ArPerimetro());
    r2.Dibujar();
    }
}