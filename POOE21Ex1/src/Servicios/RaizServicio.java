/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raiz;
import java.util.Scanner;

/**
 * Luego, en RaicesServicio las operaciones que se podrán realizar son las 
 * siguientes:
 * Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el 
 * signo delante de -b
 *
 * @author Josefina
 */
public class RaizServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Raiz crearRaiz(){
        int a,b,c;
        System.out.print("Ingrese valor A: ");
        a=leer.nextInt();
        System.out.print("Ingrese valor B: ");
        b=leer.nextInt();
        System.out.print("Ingrese valor C: ");
        c=leer.nextInt();
        Raiz rZ = new Raiz(a,b,c);
        return rZ;
    }
    
    // Método getDiscriminante(): devuelve el valor del discriminante (double). 
    // El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Raiz rZ) {
        return rZ.getB()*rZ.getB()-4*rZ.getA()*rZ.getC();
    }
    
    // Método tieneRaices(): devuelve un booleano indicando si tiene dos 
    // soluciones, para que esto ocurra, el discriminante debe ser mayor o 
    // igual que 0.
    public boolean tieneRaices(Raiz rZ) {
        if (rZ.getB()*rZ.getB()-4*rZ.getA()*rZ.getC()>=0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única 
    // solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raiz rZ) {
        if (rZ.getB()*rZ.getB()-4*rZ.getA()*rZ.getC()==0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, 
    // imprime las 2 posibles soluciones.
    public void obtenerRaices(Raiz rZ) {
        if (tieneRaices(rZ)) {
            double r1=(-rZ.getB()+Math.sqrt((rZ.getB()*rZ.getB())-(4*rZ.getA()*rZ.getC())))/(2*rZ.getA());
            System.out.println("Raiz 1 = " + r1);
            double r2=(-rZ.getB()-Math.sqrt((rZ.getB()*rZ.getB())-(4*rZ.getA()*rZ.getC())))/(2*rZ.getA());
            System.out.println("Raiz 2 = " + r2);
        }
    }
    
    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una 
    // única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raiz rZ) {
        if (tieneRaiz(rZ)) {
            double r1=(-rZ.getB()+Math.sqrt((rZ.getB()*rZ.getB())-(4*rZ.getA()*rZ.getC())))/(2*rZ.getA());
            System.out.println("Raiz 1 = " + r1);
        }
    }
    
    // Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
    // y mostrará por pantalla las posibles soluciones que tiene nuestra 
    // ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que 
    // devuelvan nuestros métodos y en caso de no existir solución, se mostrará
    // un mensaje.
    public void calcular(Raiz rZ) {
        if (this.tieneRaices(rZ)&&this.tieneRaiz(rZ)) {
            this.obtenerRaices(rZ);
            this.obtenerRaiz(rZ);
        } else if (this.tieneRaiz(rZ)) {
            this.obtenerRaiz(rZ);
        } else {
            System.out.println("No tiene raíces");
        }
    }
}
