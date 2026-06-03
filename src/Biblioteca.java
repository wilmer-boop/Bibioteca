/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 * LOS //son para el docente encargado de las practicas de la materia.
 */


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> catalogo;
    private List<Prestamo> prestamos;

    // Constructores
    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
        this.prestamos = new ArrayList<>(); 
    }

    // Métodos de Lectura y Escritura 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // catálogo de libros
    public void agregarLibro(Libro libro) {
        if (libro != null) {
            catalogo.add(libro);
            System.out.println("OK -> Libro agregado: " + libro.getTitulo());
        }
    }

    public void mostrarCatalogo() {
        System.out.println("\n--- Catálogo de: " + nombre + " ---");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println((i + 1) + ". " + catalogo.get(i).getInfo());
        }
    }

    //préstamos con control de encapsulamiento
    public void registrarPrestamo(Usuario u, Libro l, String f1, String f2) {
        if (l.isDisponible()) {
            Prestamo p = new Prestamo(u, l, f1, f2);
            prestamos.add(p);
            l.setDisponible(false); 
            System.out.println("Préstamo registrado correctamente para: " + u.getNombre());
        } else {
            System.out.println("ERROR: El libro '" + l.getTitulo() + "' NO está disponible para préstamo.");
        }
    }

    public void mostrarPrestamos() {
        System.out.println("\n--- Lista de préstamos activos ---");
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarPrestamo();
            System.out.println("-------------------");
        }
    }
}