/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * 
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento 
 * salarial de un empleado en función de su edad y salario actual. El aumento 
 * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si 
 * tiene menos de 30 años.
 * 
 * @author Josefina
 */
public class Empleado {
    private String nombre;
    private double salario;
    private int edad;
    
    public Empleado () {
    }
    
    public Empleado (String nombre, double salario, int edad) {
        this.nombre=nombre;
        this.salario=salario;
        this.edad=edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    public void calcularAumento () {
        if (this.edad>30) {
            this.salario=this.salario*1.1;
        } else {
            this.salario=this.salario*1.05;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + '}';
    }
    
    
}
