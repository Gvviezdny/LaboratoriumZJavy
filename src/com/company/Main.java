package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        dog.species = "canis";
        dog.weight = 21.3;
        dog.age = 5;
        dog.alive = true;

        System.out.println(dog.name);

        cat.name = "Sierśiuch";
        System.out.println("a kot żyje?" + cat.alive);
        System.out.println("waga kota: " + cat.weight);


    }
}
