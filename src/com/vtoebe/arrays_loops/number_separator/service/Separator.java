package com.vtoebe.arrays_loops.number_separator.service;

import com.vtoebe.arrays_loops.number_separator.utils.SeparateNumbersPrinter;

import java.util.ArrayList;

public class Separator {
    SeparateNumbersPrinter print = new SeparateNumbersPrinter();
    private ArrayList<Integer> oddNumbers = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public void separateAllNumbers(int[] inputNumbers){
        for(int number : inputNumbers){
            if (number % 2 != 0){ oddNumbers.add(number); }

            if (number % 2 == 0){ evenNumbers.add(number); }
        }
        print.separationResult(oddNumbers, evenNumbers);
    }
}
