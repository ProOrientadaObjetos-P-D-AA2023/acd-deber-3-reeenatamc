/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VentaDeProductos v1 = new VentaDeProductos();

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        v1.setPrecio(precio);

        System.out.println("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();
        v1.setCantidad(cantidad);
        
        
        double descuento = v1.calDescu();
        double precioFinal = v1.calPFinal();

        System.out.println("El descuento es de: " + descuento+" dolares.");
        System.out.println("Precio final es: " + precioFinal+" dolares.");

        scanner.close();
    }
}
