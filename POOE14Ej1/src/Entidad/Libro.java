/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un 
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.
*/
package Entidad;

/**
 *
 * @author Josefina
 */
public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int Paginas;

//constructor
    public Libro() {
    }

//constructor
    public Libro(String ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }
    
//metodo SUPERSETTER
    public void llenarLibro(String ISBN, String Titulo, String Autor, int paginas){
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }    

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

//metodo SUPERGETTER
    public void mostrarLibro() {
        System.out.println(this.ISBN);
        System.out.println(this.Titulo);
        System.out.println(this.Autor);
        System.out.println(this.Paginas);
    }

}
