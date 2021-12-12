package com.vtoebe.arrays_loops.fruit_cart.service;


import com.vtoebe.arrays_loops.fruit_cart.utils.FruitCartWriter;

public class CartHandler {
    FruitCartWriter write = new FruitCartWriter();

    public boolean checkCartSize(String[] fruitList){
        return fruitList.length > 4;
    }
}
