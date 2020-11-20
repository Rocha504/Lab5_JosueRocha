 
package lab5_josuerocha;

/**
 *
 * @author josue
 */
public class Clases {
    
    private String nombre;
    private String seccion;
    private int edificio;
    private String salon;
    private String aire;

    public Clases() {
    }

    public Clases(String nombre, String seccion, int edificio, String salon, String aire) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.aire = aire;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
