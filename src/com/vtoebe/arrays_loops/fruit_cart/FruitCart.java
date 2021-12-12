package com.vtoebe.arrays_loops.fruit_cart;

import com.vtoebe.arrays_loops.fruit_cart.service.CartHandler;
import com.vtoebe.arrays_loops.fruit_cart.utils.FruitCartPrinter;
import com.vtoebe.arrays_loops.fruit_cart.utils.FruitCartWriter;
import com.vtoebe.arrays_loops.service.ContinuityChecker;

public class FruitCart {
    public static void main(String[] args){
        ContinuityChecker continuity = new ContinuityChecker();

        FruitCartPrinter print = new FruitCartPrinter();
        FruitCartWriter write = new FruitCartWriter();

        do {
            write.fruitList(print.requestFruits());
            print.showCart(write.getFruitList());
        } while (continuity.checkFruit());

    }
}
