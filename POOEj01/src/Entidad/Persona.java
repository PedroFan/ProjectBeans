/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Josefina
 */
public class Persona {
    private String nombre;
    private int edad;
    private String profesion;
    
    public Persona() {
    }

    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

 /*  @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + '}';
    }*/
}


