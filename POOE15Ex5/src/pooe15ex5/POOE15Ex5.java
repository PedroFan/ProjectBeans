/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ex5;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class POOE15Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado();
        System.out.print("Nombre: ");
        e1.setNombre(new Scanner(System.in).useDelimiter("\n").next());
        System.out.print("Salario: ");
        e1.setSalario(new Scanner(System.in).nextDouble());
        System.out.print("Edad: ");
        e1.setEdad(new Scanner(System.in).nextInt());
        System.out.println("");
        e1.calcularAumento();
        System.out.println(e1);
        
    }
    
}
