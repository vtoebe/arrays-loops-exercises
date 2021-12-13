package com.vtoebe.arrays_loops.youngest_oldest_average.utils;

import java.util.ArrayList;
import java.util.Scanner;

public class YoungOldAvgWriter {
    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = scan.next();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = scan.nextInt();
    }



}
