/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ex4;

import Entidad.Cuenta;

/**
 *
 * @author Josefina
 */
public class POOE15Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta("Pedro",2981.5);
        System.out.println("Saldo $" + c1.getSaldo());
        System.out.println("");
        System.out.println("Retire $" + c1.retirarDinero());
        System.out.println("");
        System.out.println("Saldo $" + c1.getSaldo());
    }
    
}
