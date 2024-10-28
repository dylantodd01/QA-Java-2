package com.qa;

public class Tortoise extends Animal{

    private String shellColour;


    // All args constructor
    public Tortoise(int weight, int age, String shellColour) {
        super(weight, age);
        this.shellColour = shellColour;

    }
    // Some args constructor
    public Tortoise(int weight, int age) {
        super();
        this.shellColour = "Brown";
    }

    @Override
    public String toString() {
        return "Tortoise{" + super.toString() +
                ", shellColour='" + shellColour + '\'' +
                '}';
    }

    public void makeNoise() {
        System.out.println("Squeak");
    }
}
