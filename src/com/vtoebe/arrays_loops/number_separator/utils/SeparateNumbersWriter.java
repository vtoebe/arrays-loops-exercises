package com.vtoebe.arrays_loops.number_separator.utils;

import java.util.ArrayList;

public class SeparateNumbersWriter {

    private ArrayList<Integer> inputNumbers;
    private ArrayList<Integer> oddNumbers;
    private ArrayList<Integer> evenNumbers;

    public ArrayList<Integer> getInputNumbers() {
        return inputNumbers;
    }

    public void setInputNumbers(String inputNumbers) {
        String[] numbers = stringToIntArr(inputNumbers);

        for (int i = 0; i==numbers.length; i+=1) {
            this.inputNumbers.add(Integer.valueOf(numbers[i]));
        }
    }

    public ArrayList<Integer> getOddNumbers() {
        for (int n: oddNumbers) {
            System.out.println(n);
        }
        return this.oddNumbers;
    }
//
    public void setOddNumbers(ArrayList<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public ArrayList<Integer> getEvenNumbers() {
        for (int n: evenNumbers
        ) {
            System.out.println(n);
        }
        return this.evenNumbers;
    }

    public void setEvenNumbers(ArrayList<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public String[] stringToIntArr(String str){
        return str.replace(" ", "").split(",");
    }

    public String separationResult(){
        return "";
    }
}
