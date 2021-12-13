package com.vtoebe.arrays_loops.number_separator.service;

import com.vtoebe.arrays_loops.number_separator.utils.SeparateNumbersWriter;

import java.util.ArrayList;

public class Separator {
    SeparateNumbersWriter w = new SeparateNumbersWriter();
    private final ArrayList<Integer> oddNumbers = new ArrayList<Integer>(0);
    private final ArrayList<Integer> evenNumbers = new ArrayList<Integer>(0);

    public void separateOdd(ArrayList<Integer> inputNumbers){
        for (int number:inputNumbers) {
            if (number%2!=0){
                oddNumbers.add(number);
            }
        }
        System.out.println(oddNumbers);
        w.setOddNumbers(oddNumbers);
    }

    public void separateEven(ArrayList<Integer> inputNumbers){
        for (int number:inputNumbers) {
            if (number%2==0){
                evenNumbers.add(number);
            }
        }
        w.setEvenNumbers(evenNumbers);

        for (int number:evenNumbers
             ) {
            System.out.println(number);
        }
        System.out.println(evenNumbers);
    }

    public void separateAllNumbers(ArrayList<Integer> numbers){
            separateOdd(numbers);
            separateEven(numbers);
    }
}
