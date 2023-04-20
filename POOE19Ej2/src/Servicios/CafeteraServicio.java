/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
* Crear clase CafeteraServicio en el paquete Servicios con lo 
 * siguiente:
 * 
 * @author Josefina
 */
public class CafeteraServicio {
   // Scanner leer = new Scanner(System.in);
    
    
    // Constructor crearCafetera()
    public Cafetera crearCafetera(){
        Cafetera cafet = new Cafetera();
        return cafet;
    }
    
    // Método llenarCafetera(): hace que la cantidad actual sea 
    // igual a la capacidad máxima. 
    
    public void llenarCafetera(Cafetera cF){
        cF.setCantidadActual(cF.getCapacidadMaxima());
    }
    
    // Método servirTaza(int): se pide el tamaño de una taza 
    // vacía, el método recibe el tamaño de la taza y simula 
    // la acción de servir la taza con la capacidad indicada. 
    // Si la cantidad actual de café “no alcanza” para llenar 
    // la taza, se sirve lo que quede. El método le informará 
    // al usuario si se llenó o no la taza, y de no haberse 
    // llenado en cuanto quedó la taza.
    
    public double servirTaza(int taza,Cafetera cF) {
        if (taza>cF.getCantidadActual()) {
            double lleve=cF.getCantidadActual();
            cF.setCantidadActual(0);
            return lleve;
        } else {
            cF.setCantidadActual(cF.getCantidadActual()-taza);
            return taza;
        }
    }
    
    // Método vaciarCafetera(): pone la cantidad de café 
    // actual en cero.
    
    public void vaciarCafetera(Cafetera cF) {
        cF.setCantidadActual(0);
    }
    
    // Método agregarCafe(int): se le pide al usuario una 
    // cantidad de café, el método lo recibe y se añade a la 
    // cafetera la cantidad de café indicada.
    
    public double agregarCafe(int cantidad,Cafetera cF) {
        if (cF.getCantidadActual()==cF.getCapacidadMaxima()) {
            return 0;
        } else if (cF.getCantidadActual()+cantidad>cF.getCapacidadMaxima()) {
            double esMucho = cF.getCapacidadMaxima()-cF.getCantidadActual();
            cF.setCantidadActual(cF.getCapacidadMaxima());
            return esMucho;
        } else {                    
            cF.setCantidadActual(cF.getCantidadActual()+cantidad);
            return cantidad;
        }
    }
}
