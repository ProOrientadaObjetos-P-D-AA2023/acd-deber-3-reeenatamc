/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author LENOVO
 */
public class Empleado {
    private String nombre;
    private double salario;
    private int edad;
    
    public Empleado(String nom, double sala, int edaad) {
        nombre = nom;
        salario = sala;
        edad = edaad;
    }
    
 
    
    //getter y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombree) {
        nombre = nombree;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salarioo) {
        salario = salarioo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edadd) {
        edad = edadd;
    }
    
    @Override
    public String toString() {
    return "Nombre: " + nombre + ", Salario: " + salario + ", Edad: " + edad;
}
}
