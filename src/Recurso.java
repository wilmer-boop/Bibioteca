/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 */
    public class Recurso {
    private String titulo;
    private String isbn;
    private int anio;
    private boolean disponible;

    // Constructor 
    public Recurso(String titulo, String isbn, int anio) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anio = anio;
        this.disponible = true;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    // Método 
    public String getInfo() {
        return "Titulo: " + titulo + " | ISBN: " + isbn + " | Año: " + anio + " | Disponible: " + (disponible ? "Sí" : "No");
    }
}
    

