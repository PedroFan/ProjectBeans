/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos 
 * puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
 * Generar un objeto puntos usando un método crearPuntos() que le pide al 
 * usuario los dos números y los ingresa en los atributos del objeto. Después, 
 * a través de otro método calcular y devolver la distancia que existe entre 
 * los dos puntos que existen en la clase Puntos.
 * @author Josefina
 */
public class Punto {
    private int equisUno;
    private int equisDos;
    private int yUno;
    private int yDos;

    public Punto() {
    }

    public Punto(int equisUno, int equisDos, int yUno, int yDos) {
        this.equisUno = equisUno;
        this.equisDos = equisDos;
        this.yUno = yUno;
        this.yDos = yDos;
    }

    @Override
    public String toString() {
        return "Punto{" + "equisUno=" + equisUno + ", equisDos=" + equisDos + ", yUno=" + yUno + ", yDos=" + yDos + '}';
    }
    
    
    
    public void crearPuntos (int x1, int y1, int x2, int y2) {
        this.equisUno=x1;
        this.equisDos=x2;
        this.yUno=y1;
        this.yDos=y2;
    }
    
    public double distancia () {
        double dista=0;
        //System.out.println("" + (this.equisDos-this.equisUno));
        //System.out.println("" + (this.yDos-this.yUno));
        dista=Math.sqrt((this.equisDos-this.equisUno)^2+(this.yDos-this.yUno)^2);
        //System.out.println("" + dista);
        return dista;
    }
    
    
}
