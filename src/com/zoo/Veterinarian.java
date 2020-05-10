package com.zoo;

public class Veterinarian {
    void treatAnimal(Animal animal) {
        System.out.println("Food: " + animal.food + ", Location: " + animal.location);
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("fish", "home", "Cap"),
                new Dog("meat", "yard", "Junior"),
                new Horse("grass", "barn", "Inokentyi")
        };

        Veterinarian vet = new Veterinarian();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}


