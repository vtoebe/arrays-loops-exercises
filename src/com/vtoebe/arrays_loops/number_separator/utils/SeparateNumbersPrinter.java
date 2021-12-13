package com.vtoebe.arrays_loops.number_separator.utils;

import javax.swing.*;

public class SeparateNumbersPrinter {
    SeparateNumbersWriter write = new SeparateNumbersWriter();

    final String NUMBERS_REQUEST = "Please enter at least 5 numbers: ";

    public String requestNumbers(){
        return JOptionPane.showInputDialog(
                null,
                NUMBERS_REQUEST,
                "Number Separator",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void separationResult(String separationResult){
        JOptionPane.showMessageDialog(
                null,
                separationResult,
                "Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
