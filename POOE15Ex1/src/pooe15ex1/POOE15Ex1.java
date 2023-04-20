/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe15ex1;

import Entidad.Cancion;

/**
 *
 * @author Josefina
 */
public class POOE15Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        Cancion c1 = new Cancion("Alien Dulce","Patricio Rey y sus redonditos de ricota");
        System.out.println("Titulo: " + c1.getTitulo() + " - Autor: " + c1.getAutor());
    }
    
}
