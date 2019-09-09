package com.company;

public class Human extends Animal {
    private String country;
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Human(String name, int age, String country) {
        super(name, age);
        this.country=country;
    }

    @Override
    public void say() {
        System.out.println("the human is in"+country);
    }
}
