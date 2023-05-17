/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[10];
        int cantidadEmpleados = 0;

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            if (opcion == 1) {
                if (cantidadEmpleados < empleados.length) {
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    System.out.println("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();

                    Empleado empleado = new Empleado(nombre, salario, edad);
                    empleados[cantidadEmpleados] = empleado;
                    cantidadEmpleados++;

                    System.out.println("Empleado agregado exitosamente.");
                } else {
                    System.out.println("No es posible agregar más empleados. La lista está llena.");
                }
            } else if (opcion == 2) {
                System.out.println("Información de los empleados:");
                for (int i = 0; i < cantidadEmpleados; i++) {
                    System.out.println(empleados[i].toString());
                }
            } else if (opcion == 3) {
                if (cantidadEmpleados > 0) {
                    System.out.println("Ingrese el porcentaje de aumento salarial: ");
                    double porcentajeAumento = scanner.nextDouble();

                    double salarioPromedio = calcularSalarioPromedio(empleados, cantidadEmpleados);

                    for (int i = 0; i < cantidadEmpleados; i++) {
                        if (empleados[i].getSalario() < salarioPromedio) {
                            double aumento = empleados[i].getSalario() * (porcentajeAumento / 100);
                            empleados[i].setSalario(empleados[i].getSalario() + aumento);
                        }
                    }

                    System.out.println("Aumento salarial aplicado.");
                } else {
                    System.out.println("No hay empleados registrados.");
                }
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
    private static double calcularSalarioPromedio(Empleado[] empleados, int cantidadEmpleados) {
        double totalSalarios = 0;

        for (int i = 0; i < cantidadEmpleados; i++) {
            totalSalarios += empleados[i].getSalario();
        }

        return totalSalarios / cantidadEmpleados;
    }
    }

