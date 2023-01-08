package Models;

import java.util.ArrayList;

/**
 *
 * @author No one
 */
public class Album {
    private int id;
    private String descripcion;
    private ArrayList<Integer> personasIds = new ArrayList<>();
    private ArrayList<Integer> fotosIds = new ArrayList<>();
    
    public Album(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    // Getters & Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Integer> getPersonasIds() {
        return personasIds;
    }

    public void setPersonasIds(ArrayList<Integer> personasIds) {
        this.personasIds = personasIds;
    }

    public ArrayList<Integer> getFotosIds() {
        return fotosIds;
    }

    public void setFotosIds(ArrayList<Integer> fotosIds) {
        this.fotosIds = fotosIds;
    }
}
