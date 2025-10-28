/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(3),
            new Rectangulo(2, 8)
        };

        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
}