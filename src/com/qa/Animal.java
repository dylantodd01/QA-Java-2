package com.qa;

public abstract class Animal {

    int weight;
    int age;

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
