/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 800000));
        empleados.add(new EmpleadoTemporal("Luis", 1000, 300));
        empleados.add(new EmpleadoPlanta("Carlos", 900000));
        empleados.add(new EmpleadoTemporal("Maria", 1200, 300));

        for (Empleado emp : empleados) {
            System.out.println("Nombre: " + emp.nombre + " - Sueldo: $" + emp.calcularSueldo());
            
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
            System.out.println("----------------------");
        }
    }
}