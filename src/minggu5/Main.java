/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author ASUS
 */
 class Animal {
   public void makeNoise() {
        System.out.println("talk");
    }
}

// Kelas Dog yang merupakan turunan dari Animal
 class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise(); // Memanggil method dari class Animal

        Dog dog = new Dog();
        dog.makeNoise(); // Memanggil method dari class Dog

        Animal animaldog = new Dog();
        animaldog.makeNoise(); // Memanggil method dari class Dog (Polymorphism)

        // Mengecek tipe objek dengan instanceof
        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }

        if (dog instanceof Animal) {
            System.out.println("Dog is Animal");
        }

        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }
    }
}
