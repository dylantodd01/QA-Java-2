package com.qa;

public class Animal {

    private int weight;
    private int age;

    // All args constructor
    public Animal(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    // No args constructor
    public Animal() {}

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", age=" + age;
    }

    public void makeNoise() {
        System.out.println("(little) Growl");
    }
}
