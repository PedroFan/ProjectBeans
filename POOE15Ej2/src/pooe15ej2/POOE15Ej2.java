/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ej2;

import Entidad.Circunferencia;
import java.util.Scanner;


/**
 *
 * @author Josefina
 */
public class POOE15Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
        A continuación, se deben crear los siguientes métodos:
        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio)*/
        
        Circunferencia c1 = new Circunferencia();//instancia un objeto de nombre c1
               
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = leer.nextDouble();
        c1.crearCircunferencia(radio);
        System.out.print("El area es: " + c1.areaMetodo());
        System.out.println("El perimetro es: " + c1.perimetroMetodo());
        }
}
    