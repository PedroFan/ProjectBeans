/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe20ej3;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.ArrayList;

/**
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la 
 * persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
 * peso ideal e indicar para cada objeto si la persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y 
 * esMayorDeEdad en distintas variables(arrays), para después calcular un 
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, 
 * cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
 * un porcentaje de cuantos son mayores de edad y cuantos menores. Para 
 * esto, podemos crear unos métodos adicionales.
 *
 * @author Josefina
 */

public class POOE20Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> alP = new ArrayList<Persona>();
        PersonaServicio persSe = new PersonaServicio ();
        Persona p1=persSe.crearPersona();
        Persona p2=persSe.crearPersona();
        Persona p3=persSe.crearPersona();
        Persona p4=persSe.crearPersona();
        alP.add(p1);
        alP.add(p2);
        alP.add(p3);
        alP.add(p4);
        boolean [] esMayor = new boolean [4];
        int [] imc = new int [4];
        int i,acum=0,sobrepeso=0, ideal=0;
        // System.out.println("alP.get[0]" + alP.get(0));
        for (i=0;i<4;i++) {
            if (persSe.esMayorDeEdad(alP.get(i))) {
                esMayor[i]=true;
                acum++;
            } else {
                esMayor[i]=false;
            }
            imc[i]=persSe.calcularIMC(alP.get(i));
            switch (imc[i]){
                case 1:
                    sobrepeso++;
                    break;
                case 2:
                    ideal++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Porcentaje de mayores de edad: " + acum*100/4);
        System.out.println("Porcentaje de menores de edad: " + (4-acum)*100/4);
        System.out.println("Porcentaje de IMC alto: " + sobrepeso*100/4);
        System.out.println("Porcentaje de IMC ideal: " + ideal*100/4);
        System.out.println("Porcentaje de IMC bajo: " + (4-sobrepeso-ideal)*100/4);
    }
    //Persona p2 = new Persona ("Pedro",42,"M",74.5,173);
    //System.out.println("" + p1);
    //System.out.println();
    //alP.add(0, p8);
}
    

