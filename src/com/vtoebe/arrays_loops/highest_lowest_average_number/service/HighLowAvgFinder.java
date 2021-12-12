package com.vtoebe.arrays_loops.highest_lowest_average_number.service;

public class HighLowAvgFinder {
    private int highestNumber = 0;
    private Integer lowestNumber = null;
    private float averageNumber = 0.2f;


    public int highestNumber(int[] inputNumbers){
        for (int number:inputNumbers) {
            if (number > this.highestNumber){
                this.highestNumber = number;
            }
        }
        System.out.println(highestNumber);
        return highestNumber;
    }

    public int lowestNumber(int[] inputNumbers){
        for (int number:inputNumbers) {
            if (this.lowestNumber == null){
                this.lowestNumber = number;
            } else if (number < this.lowestNumber){
                this.lowestNumber = number;
            }
        }
        System.out.println(lowestNumber);
        return lowestNumber;
    }

    public float averageNumber(int[] inputNumbers){
        return this.averageNumber = (highestNumber + lowestNumber)/2;
    }
}
