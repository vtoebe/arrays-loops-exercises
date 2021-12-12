package com.vtoebe.arrays_loops.fruit_cart.utils;

import javax.swing.*;

public class FruitCartPrinter {
    final String INITIALIZE = "Add at least five items to your cart, separated by a comma: ";

    public String requestFruits(){
        return JOptionPane.showInputDialog(
                null,
                INITIALIZE,
                "Add items to your cart!",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void showCart(String[] fruitList){

        System.out.println("=== YOUR CART ===");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        JOptionPane.showMessageDialog(null, new JList<>(fruitList), "Your Cart", JOptionPane.INFORMATION_MESSAGE);
    }
}
