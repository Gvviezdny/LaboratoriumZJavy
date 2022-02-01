package com.company;

import com.company.devices.Car;

import com.company.devices.*;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        {
        }
        ;

        Animal cat = new Animal("felis");
        {
        }
        ;
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

        Integer humanAge = dog.getHumanAge();
        System.out.println("If i'll be human, i'll be " + humanAge + " years old");




        cat.doYouLike("mouse");
        dog.doYouLike("mouse");


        Car Zastava = new LPG();
        Car Trabant = new Electric();
        Car Porshe = new Disel();
        Car Pontiac = new Disel();
        Car Ferrari = new Disel();

        Phone Xiaomi = new Phone(); // wiadomo Xiaomi lepsze
        Phone Iphone = new Phone();
        Phone Sony = new Phone();

        Xiaomi.screenSize = 7.0;
        Xiaomi.os = "Android 9.0";

        Iphone.screenSize = 5.0;
        Iphone.os = "IOS";

        Sony.screenSize = 6.5;
        Sony.os = "Android 7.0";

       // Zastava.producer = "Zastava";
       // Zastava.model = "1100p";
       // Zastava.millage = 2137.0;
       // Zastava.engineSize = 1.4;

        // to cos nie dzialaCar trabant = new Car();
        //to cos nie dziala trabant.producer = "NRD";
        // to cos nie dziala trabant.model ="trabant";
        // to cos nie dzialaZastava.millage = 1337.0;
        //to cos nie dziala Zastava.engineSize = 0.8;


        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Barsow";
        me.setCar(Trabant);
        me.setSalary(8000.0);
        me.getSalary();
        me.setSalary(-1.00);
        me.setSalary(3500.0);
        me.setCar(Zastava);
        me.pet = dog;
        me.phone = Sony;

        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it: " + me.pet.name);

        me.pet.feed();
        me.pet.takeForAWalk();

        Human Tadeusz = new Human();
        Tadeusz.cash = 5000.0;
        Human Henryk = new Human();
        Human Wojtek = new Human();
        Wojtek.cash = 40000.0;
        Wojtek.setCar(Ferrari);
        Henryk.cash = 2000.0;
        Henryk.setCar(Porshe);
        Henryk.setPhone(Xiaomi);
        Tadeusz.setCar(Trabant);
        Tadeusz.setCar(Pontiac);
        Tadeusz.setPhone(Iphone);
        Henryk.setPhone(Xiaomi);


        Pontiac.sale(me, Tadeusz, 2137.0);
        Trabant.sale(me, Tadeusz, 1000.0);

        Pontiac.engineSize = 6.0;

        Xiaomi.screenSize = 7.0;
        Xiaomi.os = "Android 9.0";

        Iphone.screenSize = 5.5;
        Iphone.os = "IOS";

        Iphone.sale(me, Tadeusz, 700.0);
        Xiaomi.sale(me, Henryk, 900.0);





        if (me.getCar() != null) {
            System.out.println(me.getCar().model);
        }

        try {
            System.out.println(me.getCar().model);
        } catch (Exception var12) {
            System.out.println("You don't have a car");
        }
        Integer[] numbers = new Integer[5];
        numbers[0] = 32;
        numbers[0] = -32;
        numbers[0] = 320;
        numbers[0] = 132;
        numbers[0] = 322;

        System.out.println(numbers[2]);
        System.out.println(numbers[4]);

        String[] names = {"Kasia", "Ania", "Mietek", "Janusz"};
        Integer[] otherNumbers = {1, 2, 3, 432, 123, 234, 2342, 432};

        System.out.println(names.length);

    }

}
      //  List<Integer> listOfNumbers = new LinkedList<>();
      //  listOfNumbers.add(4);
      //  listOfNumbers.add(123);
     //   listOfNumbers.add(432);
      //  listOfNumbers.add(432);
      //  listOfNumbers.add(432);
      //  listOfNumbers.add(-1);
      //  System.out.println(listOfNumbers.size());

     //   Set<Integer> setOfNumbers = new HashSet<>();
     //   setOfNumbers.add(4);
      //  setOfNumbers.add(123);
      //  setOfNumbers.add(432);
      //  setOfNumbers.add(432);
      //  setOfNumbers.add(432);
      //  setOfNumbers.add(-1);
     //   System.out.println("debug");

     //   for(Integer i : listOfNumbers) {
    //        System.out.println(i);


      //  for (Integer d: setOfNumbers) {
          //  System.out.println(d);


