


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

public class Libro extends Recurso {
    private List<Autor> autores; 
    public Libro(String titulo, String isbn, int anio) {
        super(titulo, isbn, anio); 
        this.autores = new ArrayList<>();
    }

    public void agregarAutor(Autor autor) {
        if (autor != null && !autores.contains(autor)) {
            autores.add(autor);
        }
    }

    // se aplica sobreescritura
    @Override
    public String getInfo() {
        // Usamos super.getInfo() para traer lo que armó el padre y le sumamos los autores
        StringBuilder sb = new StringBuilder(super.getInfo());
        sb.append(" | Autores: ");
        for (int i = 0; i < autores.size(); i++) {
            sb.append(autores.get(i).getDescripcion());
            if (i < autores.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}