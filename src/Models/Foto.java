package Models;

import java.util.ArrayList;

/**
 *
 * @author No one
 */
public class Foto {
    private int id;
    private String descripcion;
    private Lugar lugar;
    private ArrayList<Integer> fecha = new ArrayList<>();
    private ArrayList<Integer> personasIds = new ArrayList<>();
    private ArrayList<Integer> albumesIds = new ArrayList<>();
    
    public Foto(int id, String descripcion, String fecha) {
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

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Integer> getFecha() {
        return fecha;
    }
    
    public void setFecha(ArrayList<Integer> fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Integer> getAlbumesIds() {
        return albumesIds;
    }

    public void setAlbumesIds(ArrayList<Integer> albumesIds) {
        this.albumesIds = albumesIds;
    }

    public ArrayList<Integer> getPersonasIds() {
        return personasIds;
    }

    public void setPersonasIds(ArrayList<Integer> personasIds) {
        this.personasIds = personasIds;
    }
}
