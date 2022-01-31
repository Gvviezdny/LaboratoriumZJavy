package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;



import java.util.Date;
import java.util.Objects;

public class Human extends Animal {
        String firstName;
        String lastName;
        Integer age;
        private Double salary = 3000.00;
        public Animal pet;
        public Car car;
        public Double cash = 20000.0;
        public Phone phone;

        Human() {



                super("Human");
                this.salary = 8000.0;

        }




        Double getSalary() {
                System.out.println("Salary: " + this.salary);
                System.out.println(new Date());
                System.out.println("Salary: " + this.salary);
                return this.salary;
        }


        void setSalary(Double salary) {
                if (salary > 0) {
                        System.out.println("dane wysyłane systemu księgowego");
                        System.out.println("odbierz aneks od pani Hani");
                        System.out.println("ZUS I US JUŻ WIEDZĄ O PIENIĄDZACH");
                        this.salary = salary;
                        System.out.println("Salary: " + this.salary);
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
        public Car getCar() {
                return this.car;
        }

        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                } else if (o != null && this.getClass() == o.getClass()) return false;
                        Human human = (Human)o;
                        return Objects.equals(this.firstName, human.firstName) && Objects.equals(this.lastName, human.lastName) && Objects.equals(this.age, human.age) && this.salary.equals(human.salary) && Objects.equals(this.pet, human.pet) && Objects.equals(this.car, human.car);

                }

        @Override
        public int hashCode() {
                return Objects.hash(firstName, lastName, age, salary, pet, car);
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