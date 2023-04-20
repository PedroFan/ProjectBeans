/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class PersonaServicio {
    public Persona crearPersona () {
        Persona personaCompleta = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        personaCompleta.setNombre(new Scanner(System.in).next());
        return personaCompleta;
    }
    //EJERCICIO Guia 7
    public void mostrarPersona (Persona p1) {
        //Persona personaCompleta = new Persona();
        System.out.println("Nombre: " + p1.getNombre() + " NroId: " + p1.getNroId());
    }
}
