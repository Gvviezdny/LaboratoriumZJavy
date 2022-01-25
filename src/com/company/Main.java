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
        cat.introduceYourself();
        dog.introduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Car zastava = new Car();
        zastava.producer = "Zastava";
        zastava.model = "1100p";
        zastava.millage = 2137.0;
        zastava.engineSize = 1.4;

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Barsow";

        me.pet = dog;
        me.pet.feed();
        me.pet.takeForAWalk();

    }
}
