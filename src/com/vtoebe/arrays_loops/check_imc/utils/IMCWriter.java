package com.vtoebe.arrays_loops.check_imc.utils;

import java.util.Scanner;

public class IMCWriter {
    Scanner scan = new Scanner(System.in);

    private String name;
    private float height;
    private float weight;

    public String getName() { return name; }
    public void setName() { this.name = scan.next(); }

    public float getHeight() { return height; }
    public void setHeight() { this.height = scan.nextFloat(); }

    public float getWeight() { return weight; }
    public void setWeight() { this.weight = scan.nextFloat(); }
}
