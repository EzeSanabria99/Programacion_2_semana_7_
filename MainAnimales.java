/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

public class MainAnimales {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Ares"));
        animales.add(new Gato("Titon"));
        animales.add(new Vaca("Macarena"));
        animales.add(new Perro("Mechita"));
        animales.add(new Gato("Luna"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println();
        }
    }
}
