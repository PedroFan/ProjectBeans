/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe21ex1;

import Entidades.Raiz;
import Servicios.RaizServicio;

/**
 *
 * @author Josefina
 */
public class POOE21Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RaizServicio rServ = new RaizServicio();
        Raiz erre = rServ.crearRaiz();
        
        System.out.println("Discriminante: " + rServ.getDiscriminante(erre));
        rServ.calcular(erre);
        
        
    }
    
}
