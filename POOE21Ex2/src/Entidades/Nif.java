/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con 
 * su correspondiente letra (NIF). Los atributos serán el número de DNI (entero 
 * largo) y la letra (String o char) que le corresponde
 * 
 * @author Josefina
 */

public class Nif {
    private long dni;
    private char letra;
    
    public Nif () {
    }
    
    public Nif (long dni, char letra) {
        this.dni=dni;
        this.letra=letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
}
