/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe19ej2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 * Cafetera
 * @author Josefina
 */
public class POOE19Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteraServicio cafetS = new CafeteraServicio();
        Cafetera cF = cafetS.crearCafetera();
        
        Scanner leer = new Scanner(System.in);
        
        double resultado=0;
        byte opcion=0;
        boolean salir=false;
        
        while (!salir){
            do {
                System.out.println("");
                System.out.println("");
                System.out.println("--- HAY CAFE, CAFE ---");
                System.out.println("");
                System.out.println("0_ Salir");
                System.out.println("1_ Definir capacidad");
                System.out.println("2_ Llenar cafetera");
                System.out.println("3_ Servir taza");
                System.out.println("4_ Vaciar cafetera");
                System.out.println("5_ Agregar cafe");
                System.out.println("6_ Mostrar cantidad actual");
                System.out.println("");
                System.out.println("Opción: ");
                opcion=leer.nextByte();
                switch (opcion) {
                    case 0:
                        salir=true;
                        break;
                    case 1:
                        System.out.print("Capacidad de la cafetera (en cm3): "); 
                        cF.setCapacidadMaxima(leer.nextDouble());
                        break;
                    case 2:
                        cafetS.llenarCafetera(cF);
                        break;
                    case 3:
                        System.out.print("Tamaño de taza vacía (en cm3): ");
                        resultado=cafetS.servirTaza(leer.nextInt(),cF);
                        System.out.println("La taza contiene: " + resultado + " cm3");
                        break;
                    case 4:
                        cafetS.vaciarCafetera(cF);
                        break;
                    case 5:
                        System.out.print("Cantidad de cafe a agregar (en cm3): ");
                        resultado=cafetS.agregarCafe(leer.nextInt(),cF);
                        System.out.println("Se agregaron: " + resultado + " cm3");
                        break;
                    case 6:
                        System.out.println("Cantidad actual: " + cF.getCantidadActual() + " cm3");
                        break;
                    default:
                        break;
                }    
            } while (opcion<0||opcion>6);
        }
    }
}
