/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe19eja;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Josefina
 */
public class POOE19EjA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio persServicio = new PersonaServicio();
        Persona terceraPersona = persServicio.crearPersona();
      //  System.out.println("Nombre: " + terceraPersona.getNombre());
        
//EJERCICIO Guia 7
        
        persServicio.mostrarPersona(terceraPersona);
    }
    
}
