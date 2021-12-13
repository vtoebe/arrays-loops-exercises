package com.vtoebe.arrays_loops.youngest_oldest_average.entities;

import java.util.Scanner;

public class Person {
    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
