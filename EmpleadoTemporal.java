/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class EmpleadoTemporal extends Empleado {
    private final double pagoPorHora;
    private final int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double pagoPorHora, int horasTrabajadas) {
        super(nombre);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return pagoPorHora * horasTrabajadas;
    }
}
