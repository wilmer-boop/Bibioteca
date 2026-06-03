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
    private List<Recurso> catalogo; 
    private List<Prestamo> prestamos;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
        this.prestamos = new ArrayList<>(); 
    }

    public String getNombre() { return nombre; }

    // remplazamos  "Recurso" en lugar de solo "Libro"
    public void agregarRecurso(Recurso recurso) {
        if (recurso != null) {
            catalogo.add(recurso);
            System.out.println("OK -> Agregado al catálogo: " + recurso.getTitulo());
        }
    }

    public void mostrarCatalogo() {
        System.out.println("\n--- Catálogo de: " + nombre + " ---");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println((i + 1) + ". " + catalogo.get(i).getInfo());
        }
    }

    public void registrarPrestamo(Usuario u, Recurso r, String f1, String f2) {
        if (r.isDisponible()) {
            Prestamo p = new Prestamo(u, r, f1, f2);
            prestamos.add(p);
            r.setDisponible(false);
            System.out.println("Préstamo registrado: '" + r.getTitulo() + "' para " + u.getNombre());
        } else {
            System.out.println("ERROR: '" + r.getTitulo() + "' no está disponible.");
        }
    }
}