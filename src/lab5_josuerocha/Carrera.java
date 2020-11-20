 
package lab5_josuerocha;

/**
 *
 * @author josue
 */
public class Carrera {
    
    private String nombre;
    private String facultad;
    private double mensualidad;
    private String jefe;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, double mensualidad, String jefe) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.mensualidad = mensualidad;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", mensualidad=" + mensualidad + ", jefe=" + jefe + '}';
    }
    
    
    
}
