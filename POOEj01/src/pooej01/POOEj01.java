/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Persona p1 = new Persona();
        System.out.print("Ingrese su nombre:");
        p1.setNombre(new Scanner(System.in).next());
        System.out.print("Ingrese su edad (sólo números):");
        p1.setEdad(new Scanner(System.in).nextInt());
        System.out.print("Ingrese su profesión:");
        p1.setProfesion(new Scanner(System.in).next());
        System.out.println("");
        System.out.println(p1);
    }
    
}
