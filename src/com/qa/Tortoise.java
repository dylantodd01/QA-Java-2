package com.qa;

public class Tortoise {

    private String species;
    private int weight;
    private int age;

    // All args constructor
    public Tortoise(String species, int weight, int age) {
        this.species = species;
        this.weight = weight;
        this.age = age;
    }

    // No args constructor
    public Tortoise() {}

    public Tortoise(String species, int age) {
        this(species, 15, age);
    }

    public static void makeNoise() {
        System.out.println("Squeak");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

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
        return "Tortoise{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
