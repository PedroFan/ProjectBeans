/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeja;

import Entidad.Socio;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class POOEjA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        
// instanciación

        Socio nuevo = new Socio(0,"");
        
        Scanner leer = new Scanner(System.in);
        do {
            i++;
            nuevo.setId(i);
            System.out.print("Ingrese nombre:");
            nuevo.setNombre(leer.next());
            System.out.println("");
            System.out.print(nuevo.getId());
            System.out.print(" - " + nuevo.getNombre());
            System.out.println("");
            System.out.print("Continuar? (s/n):");
        }while(!leer.next().equalsIgnoreCase("n"));
        
        //
//        Socio.id = leer.nextInt();
        //System.out.println("Ingrese nombre:");
//        Socio.nombre=leer.next();
    }
    
}
