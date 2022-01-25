package com.company;

import java.util.Date;

public class Human {
        String firstName;
        String lastName;
        Integer age;
        private Double salary = 3000.00;
        Animal pet;
        Car car;

        Human() {
                this.salary = 5000.0;

        }

        Double getSalary() {
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