/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Enitdad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Josefina
 */
public class CuentaBancariaServicio {
    
    //Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta(){
        Scanner leer = new Scanner(System.in);
        CuentaBancaria cBC = new CuentaBancaria();
        System.out.print("Ingrese numero cuenta: ");
        cBC.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese DNI del cliente: ");
        cBC.setDniCliente(leer.nextLong());
        System.out.print("Ingrese saldo actual: ");
        cBC.setSaldoActual(leer.nextDouble());
        return cBC;
    }
    
    //Método ingresar(double): recibe una cantidad de dinero a 
    //ingresar y se le sumará al saldo actual.
    public void ingresar(double cantidad, CuentaBancaria cB){
        cB.setSaldoActual(cB.getSaldoActual()+cantidad);
    }
    
    //Método retirar(double): recibe una cantidad de dinero a 
    //retirar y se le restara al saldo actual. Si la cuenta no 
    //tiene la cantidad de dinero a retirar se retirará el máximo
    //posible hasta dejar la cuenta en 0.
    //AGREGO: y retorna cantidad porque en caso de ser mayor que 
    //saldo resto el saldo pero necesito avisar a main que el 
    //retiro fue menor que el pedido
    public double retirar(double cantidad, CuentaBancaria cB){
        if (cB.getSaldoActual()<cantidad) {
            cantidad=cB.getSaldoActual();
            cB.setSaldoActual(0);
        } else {
            cB.setSaldoActual(cB.getSaldoActual()-cantidad);
        }
        return cantidad;
    }
    
    //Método extraccionRapida: le permitirá sacar solo un 20% de 
    //su saldo. Validar que el usuario no saque más del 20%.
    //DUDA: ¿la validacion de que no saque mas del 20% la hago en 
    //este método o en main? Yo la hago en main, porque sino 
    //tendría que agregarle un atributo al objeto que me sirva de 
    //bandera
    public double extraccionRapida(CuentaBancaria cB){
        double cantidad=cB.getSaldoActual()*0.2;
        cB.setSaldoActual(cB.getSaldoActual()*0.8);
        return cantidad;
    }
    
    //Método consultarSaldo: permitirá consultar el saldo 
    //disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cB){
        System.out.println("Saldo disponible; " + cB.getSaldoActual());
    }
    
    //Método consultarDatos: permitirá mostrar todos los datos de
    //la cuenta.
    public void consultarDatos(CuentaBancaria cB){
        System.out.println("Nro Cuenta: " + cB.getNumeroCuenta() + "\nDNI: " + cB.getDniCliente() + "\nSaldo: " + cB.getSaldoActual());
    }
}
