


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioFCC = new Biblioteca("Biblioteca FCC", "Vargas Machuca");

        //Crear Autores
        Autor autor1 = new Autor("Robert C. Martin", "USA");

        //Crear un LIBRO
        Libro libro1 = new Libro("Clean Code", "1234", 2024);
        libro1.agregarAutor(autor1);

        //Crear una REVISTA 
        Revista revista1 = new Revista("National Geographic", "7777", 2026, 142);

        //Agregar ambos al catálogo de la biblioteca
        biblioFCC.agregarRecurso(libro1);
        biblioFCC.agregarRecurso(revista1);
        biblioFCC.mostrarCatalogo();
        //prestar 
        Usuario u1 = new Usuario("Juan", 101);
        System.out.println("\n--- Procesando Préstamos ---");
        biblioFCC.registrarPrestamo(u1, revista1, "02/06/2026", "09/06/2026");
        
        // Mostrar catálogo final 
        biblioFCC.mostrarCatalogo();
    }
}