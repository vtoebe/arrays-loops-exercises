package com.vtoebe.arrays_loops.highest_lowest_average_number.utils;

import javax.swing.*;

public class HighLowAvgPrinter {
    final String REQUEST_NUMBERS = "Please, digit at least 5 numbers: ";

    public String numberRequest(){
        return JOptionPane.showInputDialog(
                null,
                REQUEST_NUMBERS,
                "Highest, Lowest, Average Finder",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void HighLowAvgResult(String result){
        JOptionPane.showMessageDialog(
                null,
                result,
                "Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
