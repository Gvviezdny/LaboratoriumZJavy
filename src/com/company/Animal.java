
package com.company;
import java.util.Objects;
import com.company.Human;



public class Animal implements Saleable, Feedable {
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    public String species;
    public String name;
    public Double weight;
    public Integer age;
    public Boolean alive;
    public Boolean feed;
    public Integer takeForAWalk;

    public Animal(String species) {
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

    public void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "felis" && foodType == "mouse") {
            System.out.println("yes, I like " + foodType);
        } else {
            System.out.println("no you idiot ");
        }
    }



    public Double takeForAWalk() {
        this.weight -= 1;
        System.out.println("Pet is loosing fat");
        System.out.println("Weight after walk: " + this.weight);
        if (this.weight < 1) {
            System.out.println("Pet is dead :(");
        }
        return this.weight;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return species.equals(animal.species) && name.equals(animal.name) && weight.equals(animal.weight) && age.equals(animal.age) && alive.equals(animal.alive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, name, weight, age, alive);


    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }


    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("You don't have enough money!");
        } else if (seller.pet == null) {
            System.out.println("Seller doesn't have any pet");
        } else if (!seller.pet.equals(this)) {
            System.out.println("Seller doesn't have this one pet");
        } else if (seller.pet.species.equals("Human")) {
            System.out.println("You can't trade in people!!!");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Successful transaction, you bought an animal");
        }
    }





    public Integer getHumanAge() {
        if (this.species == "canis") {
            return this.age * 7;
        } else if (this.species == "felis") {
            return this.age * 10;
        } else {
            return this.age;
        }
    }

    public void feed(){
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double foodWeight){
        if (this.weight <= 0) {
            System.out.println("troch?? za p????no:|");
        }  else {
                this.weight += foodWeight;
                System.out.println("dzieki za ??arcie");
            }
        }

    }



