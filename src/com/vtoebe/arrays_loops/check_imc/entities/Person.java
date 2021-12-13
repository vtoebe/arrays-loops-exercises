package com.vtoebe.arrays_loops.check_imc.entities;

public class Person {
    private String name;
    private float height;
    private float weight;

    public Person(String name, float height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() { return name; }
    public float getHeight() { return height; }
    public float getWeight() { return weight; }

}
