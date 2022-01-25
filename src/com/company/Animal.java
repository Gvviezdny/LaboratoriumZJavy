
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

    }