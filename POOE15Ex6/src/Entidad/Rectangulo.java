/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * 
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
 * "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un 
 * objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el
 * área del rectángulo.
 * 
 * @author Josefina
 * 
 */

public class Rectangulo {
    private double lado1;
    private double lado2;
    
    public Rectangulo () {
    }
    
    public Rectangulo (double lado1, double lado2) {
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public double calcularArea () {
        return this.lado1*this.lado2;
    }
}
