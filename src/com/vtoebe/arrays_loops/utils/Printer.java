package com.vtoebe.arrays_loops.utils;

import javax.swing.*;

public class Printer {
    final String CONTINUE_LINE = "Would you like to continue?";
    final String CONTINUE_FRUIT = "Would you like to create a new fruit list?";

    public int continueCheck(){ return JOptionPane.showConfirmDialog(null, CONTINUE_LINE, "Continue", JOptionPane.YES_NO_OPTION); }
    public int continueFruit(){ return JOptionPane.showConfirmDialog(null, CONTINUE_FRUIT, "Continue", JOptionPane.YES_NO_OPTION); }
}
