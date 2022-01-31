package com.company.devices;

import com.company.Saleable;
import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Objects;


public class Phone extends Device implements Saleable {

    private static final String DEFAULT_APP_VERSION = "latest-stable";
    private static final String DEFAULT_SERVER_NAME = "halflife.com";
    public Double screenSize;
    public String os;


    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);

    }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Phone phone = (Phone) o;
            return producer.equals(phone.producer) && model.equals(phone.model) && screenSize.equals(phone.screenSize) && os.equals(phone.os) && yearOfProduction.equals(phone.yearOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, screenSize, os, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", os=" + os +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("GOOOOOLAS!Mordo brak ci siana Pamietaj respekt to wszystko!");
        } else if (seller.phone == null) {
            System.out.println("Sprzedający jest goły");
        } else if (!seller.phone.equals(this)) {
            System.out.println("Sprzedajacy nie ma tego konkretnego telefonu");
        } else {

            seller.cash += price;
            buyer.cash -= price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println("Kupiles se nowy telefon czas wyrywać laski");
        }
    }


    @Override
    public void turnOn() {
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("o włączyło się");
    }
     public void installAnApp(String appName) {
        System.out.println("instalowanie aplikacji" + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);

     }

    public void installAnApp(String appName, String version){
        System.out.println("instalowanie aplikacji" + appName + "w wersji" + version);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName, String version, String server) {
        System.out.println("Zainstalowałes apkę" + appName + "w wersji" + version);
        try {
        URL url = new URL("https", server, 443, appName + "-" + version);
        this.installAnApp(url);
    } catch (MalformedURLException e) {
        e.printStackTrace();
        }

    }

    public void installAnApp(URL url){

        }


    public void installAnApp(List<String> appNames){
        for (String appName : appNames) {
            this.installAnApp(appName);
        }

    }

}
