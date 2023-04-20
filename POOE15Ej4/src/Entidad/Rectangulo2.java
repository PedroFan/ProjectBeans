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
public class Rectangulo2 {
    private double base;
    private double altura;
    
    public Rectangulo2 (double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double Area(){
        return base*altura;
    }
    
    public double ArPerimetro(){
        return base*2+altura*2;
    }
    
    public void Dibujar(){
        for (int h=0;h<altura;h++) {
            for (int b=0;b<base;b++) {
                if (h==0||h==altura-1||b==0||b==base-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
