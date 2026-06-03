


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

        // Crear autores
        Autor autor1 = new Autor("Robert C. Martin", "USA");
        Autor autor2 = new Autor("Eric Gamma", "Suiza");
        Autor autor3 = new Autor("Sebas Gifind", "Nigeria");
        Autor autor4 = new Autor("Luis Galarza", "Canada");

        // Crear libros y asignar autores
        Libro libro1 = new Libro("Clean Code", "1234", 2024);
        libro1.agregarAutor(autor1);

        Libro libro2 = new Libro("Design Patterns", "321", 2026);
        libro2.agregarAutor(autor2);

        Libro libro3 = new Libro("Física", "098", 2010);
        libro3.agregarAutor(autor3);

        Libro libro4 = new Libro("Integer", "4579", 2009);
        libro4.agregarAutor(autor4);

        // Agregar libros a la biblioteca
        biblioFCC.agregarLibro(libro1);
        biblioFCC.agregarLibro(libro2);
        biblioFCC.agregarLibro(libro3);
        biblioFCC.agregarLibro(libro4);

        // Mostrar catálogo inicial
        biblioFCC.mostrarCatalogo();

        // ---------------- USUARIOS ----------------
        Usuario u1 = new Usuario("Juan", 101);
        Usuario u2 = new Usuario("Maria", 202);

        System.out.println("\nUsuarios creados:");
        u1.mostrarUsuario();
        u2.mostrarUsuario();

        // ---------------- PRESTAMOS ----------------
        System.out.println("\n----- PROCESANDO PRESTAMOS -----");

        // Primer préstamo 
        biblioFCC.registrarPrestamo(u1, libro1, "10/04/2026", "20/04/2026");
        
        // Intento de préstamo del mismo libro a Maria
        biblioFCC.registrarPrestamo(u2, libro1, "11/04/2026", "21/04/2026");

        // Mostrar préstamos realizados y catálogo actualizado
        biblioFCC.mostrarPrestamos();
        biblioFCC.mostrarCatalogo();
    }
}