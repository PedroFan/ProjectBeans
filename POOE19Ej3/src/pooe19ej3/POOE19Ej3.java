/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe19ej3;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la 
 * persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
 * peso ideal e indicar para cada objeto si la persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y 
 * esMayorDeEdad en distintas variables(arrays), para después calcular un 
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, 
 * cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
 * un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto,
 * podemos crear unos métodos adicionales.

 * @author Josefina
 */
public class POOE19Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        PersonaServicio persS = new PersonaServicio();
//        Persona [] personas = null;
//        Persona p1 = persS.crearPersona();
//        Persona p2 = persS.crearPersona();
//        Persona p3 = persS.crearPersona();
//        Persona p4 = persS.crearPersona();
        Personas();
        
//        for (int i=1;i<=4;i++) {
//            personas[i]= persS.crearPersona();
//        }
//        
//        for (int i=1;i<=4;i++) {
//            System.out.println("" + personas[i]);
//        }
//        

    }
    
    public static void Personas(){
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        
        PersonaServicio ps = new PersonaServicio();
        Persona[] personas = new Persona[4];
        
        ps.crearPersona(persona1);
        ps.crearPersona(persona2);
        ps.crearPersona(persona3);
        ps.crearPersona(persona4);
        
        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;
        personas[3] = persona4;
        
        for (int i=0;i<4;i++) {
            System.out.println("" + personas[i]);
        }
}
}
