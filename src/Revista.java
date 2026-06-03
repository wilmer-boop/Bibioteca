/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 */

    public class Revista extends Recurso {
    private int numeroEdicion; 

    // Constructor 
    public Revista(String titulo, String isbn, int anio, int numeroEdicion) {
        super(titulo, isbn, anio);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }
    public void setNumeroEdicion(int numeroEdicion) { this.numeroEdicion = numeroEdicion; }

    // se aplica la sobreescritura)
    @Override
    public String getInfo() {
        // Trae la info base del padre y le añade el número de edición de la revista
        return super.getInfo() + " | Edición N°: " + numeroEdicion;
    }
}

