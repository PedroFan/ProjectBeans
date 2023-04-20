/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
 * privado base y un atributo privado altura. La clase incluirá un método para 
 * crear el rectángulo con los datos del Rectángulo dados por el usuario. 
 * También incluirá un método para calcular la superficie del rectángulo y un 
 * método para calcular el perímetro del rectángulo. Por último, tendremos un 
 * método que dibujará el rectángulo mediante asteriscos usando la base y la 
 * altura. Se deberán además definir los métodos getters, setters y 
 * constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 * 
 * @author Josefina
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double superficie() {
        double supe = this.base * this.altura;
        return supe;
    }
    
    public double perimetro() {
        double peri = (this.base + this.altura) * 2;
        return peri;
    }
    
    public void dibuja() {
        for (int a=0;a<this.altura;a++) {
            for (int b=0;b<this.base;b++) {
                if (a==0||a==this.altura-1||b==0||b==this.base-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
