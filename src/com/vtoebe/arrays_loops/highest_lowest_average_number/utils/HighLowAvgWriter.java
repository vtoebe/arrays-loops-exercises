package com.vtoebe.arrays_loops.highest_lowest_average_number.utils;
import com.vtoebe.arrays_loops.highest_lowest_average_number.service.HighLowAvgFinder;

import java.util.Arrays;

public class HighLowAvgWriter {
    HighLowAvgFinder find = new HighLowAvgFinder();
    private int[] inputNumbers;

    public int[] getInputNumbers() {
        return inputNumbers;
    }

    public void inputNumbers(String inputNumbers){
        String[] input = inputNumbers.replace(" ", "").split(",");
        this.inputNumbers = new int[input.length];

        for (int i = 0; i <= this.inputNumbers.length-1; i++){
            this.inputNumbers[i] = Integer.parseInt(input[i]);
        }
    }

    public String HighLowAvgFound(){
        int high = find.highestNumber(getInputNumbers());
        int low = find.lowestNumber(getInputNumbers());
        float avg = find.averageNumber();

        return "Numbers Entered: " + Arrays.toString(getInputNumbers()) +
                "\nHighest Number: " + high +
                "\nLowest Number: " + low +
                "\nAverage Number: " + avg;
    }
}
