package com.vtoebe.arrays_loops.fruit_cart.utils;

public class FruitCartWriter {
    private String[] fruitList;

    public String[] getFruitList() {
        return fruitList;
    }

    public String[] fruitList(String fruits){
        fruitList = fruits.replace(" ", "").split(",");

        int i = 0;
        for (String fruit : fruitList) {
            fruitList[i] = "Item " + (i+1) + " : " + fruit;
            i++;
        }

        return fruitList;
    }
}
