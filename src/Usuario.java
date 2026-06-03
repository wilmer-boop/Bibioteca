/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 */
public class Usuario {
    private String nombre;
    private int id;

    // Constructor
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Métodos de Lectura 
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // Métodos de Escritura 
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
    public void mostrarUsuario() {
        System.out.println("ID Usuario: " + id + " | Nombre: " + nombre);
    }
}

