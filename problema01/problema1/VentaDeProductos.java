/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author LENOVO
 */
public class VentaDeProductos {
    private double precio;
    private int cantidad;
    
    //metodo 1
    
    public double calDescu() {
        double descuento = 0;

        if (precio >= 1000 && cantidad >= 10) {
            descuento = precio * 0.10;
        } else {
            descuento = precio * 0.05;
        }

        return descuento;
    }
    public double calPFinal() {
        double descuento = calDescu();
        double precioFinal = precio - descuento;

        return precioFinal;
    }
    
    
    
    //getters y setters

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precioo) {
        precio = precioo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidadd) {
        cantidad = cantidadd;
    }

}
