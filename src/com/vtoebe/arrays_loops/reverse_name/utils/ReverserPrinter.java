package com.vtoebe.arrays_loops.reverse_name.utils;

import javax.swing.*;

public class ReverserPrinter {
    final String REQUEST_NAME = "Please, enter a name: ";

    public String nameRequest(){
        return JOptionPane.showInputDialog(
                null,
                REQUEST_NAME,
                "Name Reverser",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void resultMessage(String resultMessage){
        JOptionPane.showMessageDialog(
                null,
                resultMessage,
                "Reversed Name",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
