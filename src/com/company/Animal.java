
package com.company;

public class Animal {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;
    Boolean feed;
    Integer takeForAWalk;

    Animal(String species) {
        this.species = species;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 21.3;
        } else if (this.species == "felis") {
            this.weight = 2.5;
        } else {
            this.weight = 1.0;


        }
    }

    void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "felis" && foodType == "mouse") {
            System.out.println("yes, I like " + foodType);
        } else {
            System.out.println("no you idiot ");
        }
    }

    void feed() {
        this.weight += 1;
        System.out.println("Pet is gaining weight");
        System.out.println("Weight of pet " + this.weight);

    }

    Double takeForAWalk() {
        this.weight -= 1;
        System.out.println("Pet is loosing fat");
        System.out.println("Weight after walk: " + this.weight);
        if (this.weight < 1) {
            System.out.println("Pet is dead :(");
        }
        return this.weight;

    }

    Integer getHumanAge() {
        if (this.species == "canis") {
            return this.age * 7;
        } else if (this.species == "felis") {
            return this.age * 10;
        } else {
            return this.age;
        }
    }
}

