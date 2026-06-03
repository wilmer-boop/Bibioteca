/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 */
public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private String fechaPrestamo;
    private String fechaDevolucion;

    // Constructor
    public Prestamo(Usuario usuario, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Métodos de Lectura 
    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    // Métodos de Escritura
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarPrestamo() {
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha prestamo: " + fechaPrestamo);
        System.out.println("Fecha devolucion: " + fechaDevolucion);
    }
}