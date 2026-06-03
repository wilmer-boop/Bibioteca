


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilmer
 */
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private int anio;
    private boolean disponible;
    private List<Autor> autores;

    public Libro() {
        this.autores = new ArrayList<>();
        this.disponible = true;
    }

    // Constructor
    public Libro(String titulo, String isbn, int anio) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anio = anio;
        this.disponible = true;
        this.autores = new ArrayList<>();
    }

    // Métodos de Lectura
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }
    // Métodos de Escritura 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnio(int anio) {
        if (anio >= 1000 && anio <= 2026) {
            this.anio = anio;
        }
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos de control para la lista de Autores
    public void agregarAutor(Autor autor) {
        if (autor != null && !autores.contains(autor)) {
            autores.add(autor);
        }
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(titulo).append(" | ");
        sb.append("ISBN: ").append(isbn).append(" | ");
        
        if (anio >= 1000 && anio <= 2026) {  
            sb.append("Año: ").append(anio).append(" | "); 
        }
        
        sb.append("Disponible: ").append(disponible ? "Sí" : "No").append(" | ");
        sb.append("Autores: ");

        for (int i = 0; i < autores.size(); i++) {
            sb.append(autores.get(i).getDescripcion());
            if (i < autores.size() - 1) sb.append(", ");
        }

        return sb.toString();
    }
}

