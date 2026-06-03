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
    private Recurso recurso; 
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(Usuario usuario, Recurso recurso, String fechaPrestamo, String fechaDevolucion) {
        this.usuario = usuario;
        this.recurso = recurso;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarPrestamo() {
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Recurso: " + recurso.getTitulo());
        System.out.println("Fecha: " + fechaPrestamo + " hasta " + fechaDevolucion);
    }
}