/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe21ex2;

import Entidades.Nif;
import Servicios.NifServicio;

/**
 *
 * @author Josefina
 */
public class POOE21Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NifServicio nServ = new NifServicio();
        Nif n1 = nServ.crearNif();
        
        nServ.mostrar(n1);
    }
    
}
