package com.vtoebe.arrays_loops.number_separator.utils;
import java.util.Scanner;

public class SeparateNumbersWriter {
    Scanner scan = new Scanner(System.in);

    private int[] inputNumbers;

    public void setInputNumbers() {
        String userInput = scan.nextLine();
        String[] userInputStrArr = cleanString(userInput);
        this.inputNumbers = new int[userInputStrArr.length];

        int i = 0;
        for (String num: userInputStrArr) {
            this.inputNumbers[i] = Integer.parseInt(num);
            i++;
        }
    }

    public int[] getInputNumbers() { return this.inputNumbers; }

    public String[] cleanString(String str){ return str.replace(" ", "").split(","); }

}
