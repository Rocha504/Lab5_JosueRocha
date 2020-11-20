 
package lab5_josuerocha;

/**
 *
 * @author josue
 */
public class Estudiantes {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String nc;
    private String genero;
    private Carrera carrera;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, int edad, String nc, String genero, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nc = nc;
        this.genero = genero;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nc=" + nc + ", genero=" + genero + ", carrera=" + carrera + '}';
    }
    
    
    
    
    
}
