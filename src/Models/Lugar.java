package Models;

/**
 *
 * @author No one
 */
public class Lugar {
    private int id;
    private String nombre;
    
    public Lugar(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //Getters & Setters
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
