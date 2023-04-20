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
public class Operacion {
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double sumar() {
        return this.num1 + this.num2;    
    }
    
    public double restar() {
        double resta = this.num1 - this.num2;
        return resta;    
    }
    
    public double multiplicar() {
        double por;
        if (this.num2==0) {
            System.out.println("No se permite la multiplicación por 0.");
            por=0;
        } else {
            por = this.num1 * this.num2;
        }
        return por;    
    }
    
    public double dividir() {
        double div;
        if (this.num2==0) {
            System.out.println("No se permite la división por 0.");
            div=0;
        } else {
            div = this.num1 / this.num2;
        }
        return div;    
    }
}
