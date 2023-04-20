/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Josefina
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {// constructor explicito = por argumento
        this.radio = radio;        
    }

    public Circunferencia() {//constructor vacio = implicito
    }
        public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(double radio){
        this.radio =  radio;
    }
    public double areaMetodo(){
        double area = (3.14 * this.radio) * (3.14 * this.radio);
        return area;
    }
    public double perimetroMetodo(){
        double perimetro = 6.28 * this.radio;
        return perimetro;
    }
}
        /*Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio*/