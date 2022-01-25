package com.company;

import java.util.Date;
import java.util.Objects;

public class Human {
        String firstName;
        String lastName;
        Integer age;
        private Double salary = 3000.00;
        Animal pet;
        private Car car;

        Human() {
                this.salary = 5000.0;

        }

        Double getSalary() {
                System.out.println("Salary:" + this.salary);
                System.out.println(new Date());
                System.out.println("Salary:" + this.salary);
                return this.salary;
        }


        void setSalary(Double salary) {
                if (salary > 0) {
                        System.out.println("dane wysyłane systemu księgowego");
                        System.out.println("odbierz aneks od pani Hani");
                        System.out.println("ZUS I US JUŻ WIEDZĄ O PIENIĄDZACH");
                        this.salary = salary;
                        System.out.println("nowe wynagrodzenie: " + this.salary);
                } else {
                        System.out.println("chyba Cię Bóg opuścił");


                }
        }

        void setCar(Car newCar) {
                if (this.salary > newCar.value) {
                        this.car = newCar;
                        System.out.println("Kupiłeś fure za gotówkę");
                } else if (this.salary > newCar.value / 12.0D) {
                        this.car = newCar;
                        System.out.println("udalo sie kupić na kredyt");
                } else {
                        System.out.println("zapisz sie na studia i znajdz nowa robote albo idz po podwyzke");
                }

        }
        Car getCar() {
                return this.car;
        }

        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                } else if (o != null && this.getClass() == o.getClass()) {
                        Human human = (Human)o;
                        return Objects.equals(this.firstName, human.firstName) && Objects.equals(this.lastName, human.lastName) && Objects.equals(this.age, human.age) && this.salary.equals(human.salary) && Objects.equals(this.pet, human.pet) && Objects.equals(this.car, human.car);
                } else {
                        return false;
                }
        }


        @Override
        public String toString() {
                return "Human{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", age=" + age +
                        ", salary=" + salary +
                        ", pet=" + pet +
                        ", car=" + car +
                        '}';


        }
}