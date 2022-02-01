package com.company.devices;

import java.util.Objects;
import com.company.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable {

    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double millage;
    public Double engineSize;
    public String color;
    public Double value = 2137.00;



    public Car() {
        super("Pontiac", "TransAM", 1979);
    }
    public void turnOn() {
        System.out.println("Odpalanie fury");
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Car car = (Car)o;
            return this.producer.equals(car.producer) && this.model.equals(car.model) && this.yearOfProduction.equals(car.yearOfProduction) && this.color.equals(car.color) && Objects.equals(this.value, car.value);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, yearOfProduction, color, value);
    }
        @Override
        public String toString() {
            return "Car{" +
                    "producer='" + producer + '\'' +
                    ", model='" + model + '\'' +
                    ", yearOfProduction=" + yearOfProduction +
                    ", color='" + color + '\'' +
                    ", value=" + value +
                    '}';
        }


    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("GOOOOOLAS!Mordo brak ci siana Pamietaj respekt to wszystko!");

        } else if (seller.getCar() == null) {

            System.out.println("Sprzedający jest goły");
        } else if (!seller.getCar().equals(this)) {

            System.out.println("Sprzedajacy nie ma tego konkretnego samochodu");
        } else {

            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Kupiles se nową brykę czas wyrywać laski");
        }
    }

    abstract void refuel();

}
