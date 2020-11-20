 
package lab5_josuerocha;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Maestros {
    
    private String nombre;
    private String apellido;
    private double salario;
    private int edad;
    private ArrayList <Clases> clases;

    public Maestros() {
    }

    public Maestros(String nombre, String apellido, double salario, int edad, ArrayList<Clases> clases) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
        this.clases = clases;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Maestros{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", edad=" + edad + ", clases=" + clases + '}';
    }
    
    
    
}
