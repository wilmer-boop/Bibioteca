/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 */


    public class Autor {
    private String nombre;
    private String nacionalidad;

    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Métodos de Lectura (Getters)
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDescripcion() {
        return nombre + " (" + nacionalidad + ")";
    }

    // Métodos de Escritura 
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad != null && !nacionalidad.trim().isEmpty()) {
            this.nacionalidad = nacionalidad;
        }
    }
}


