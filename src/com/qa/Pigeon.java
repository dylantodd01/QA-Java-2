package com.qa;

public class Pigeon extends Animal implements AnimalActions{

    public Pigeon(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cooo");
    }

    @Override
    public void sleepTime() {
        System.out.println("Zzzzz");
    }
}
