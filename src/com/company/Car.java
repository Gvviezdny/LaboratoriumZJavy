package com.company;

import java.util.Objects;

public class Car {

    String producer;
    String model;
    Integer yearOfProduction;
    Double millage;
    Double engineSize;
    String color;
    Double value = 2137.00;

    public Car() {
    }

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

    public String toString() {
        return "Car{producer='" + this.producer + "', model='" + this.model + "', yearOfProduction=" + this.yearOfProduction + ", color='" + this.color + "', value=" + this.value + "}";
    }

}
