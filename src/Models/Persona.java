package Models;

import java.util.ArrayList;

/**
 *
 * @author No one
 */
public class Persona {
    private int id;
    private String nombre;
    
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    // Getters & Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}