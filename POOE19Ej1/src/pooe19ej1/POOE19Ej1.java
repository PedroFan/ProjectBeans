/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe19ej1;

import Enitdad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class POOE19Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PersonaServicio persServicio = new PersonaServicio();
        //Persona terceraPersona = persServicio.crearPersona();
        //persServicio.mostrarPersona(terceraPersona);
        Scanner leer = new Scanner(System.in);
        System.out.println("------Red BLink------");
        System.out.println("");
        System.out.println("Bienvenido:");
        System.out.println("A continuación se creará su cuenta bancaria");
        
        CuentaBancariaServicio cBS = new CuentaBancariaServicio();
        CuentaBancaria cB1 = cBS.crearCuenta();
        byte opcion=0;
        boolean estado=false;        
        while (!estado) {
            do {
                System.out.println("");
            System.out.println("");
            System.out.println("----$-Red BLink-$----");
            System.out.println("");
            System.out.println("Opciones:");
            System.out.println("0-Salir");
            System.out.println("1-Ingresar");
            System.out.println("2-Retirar");
            System.out.println("3-Extracción rápida");
            System.out.println("4-Consultar saldo");
            System.out.println("5-Consultar datos");
            System.out.println("");
            System.out.print(">");
            opcion = leer.nextByte();
            System.out.println("");
        switch (opcion){
            case 0:
                estado=true;
                break;
            case 1:
                System.out.print("Cantidad a ingresar $");
                cBS.ingresar(leer.nextDouble(), cB1);
                break;
            case 2:
                System.out.print("Cantidad a retirar: ");
                double cantidad=leer.nextDouble();
                System.out.print("Se retiraron $" + cBS.retirar(cantidad, cB1));
                break;
            case 3:
                System.out.println("Se extrajeron $" + cBS.extraccionRapida(cB1));
                break;
            case 4:
                cBS.consultarSaldo(cB1);
                break;
            case 5:
                cBS.consultarDatos(cB1);
                break;
            default:
                break;
            }
        } while (opcion<0||opcion>5);
        }
    }
    
}
