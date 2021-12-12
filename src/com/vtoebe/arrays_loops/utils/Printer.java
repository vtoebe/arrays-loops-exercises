package com.vtoebe.arrays_loops.utils;

import javax.swing.*;

public class Printer {
    final String CONTINUE_LINE = "Would you like to continue?";
    final String CONTINUE_FRUIT = "Would you like to create a new fruit list?";
    final String CONTINUE_REVERSER = "Would you like to reverse another name?";
    final String CONTINUE_SEPARATOR = "Would you like to separate numbers again?";
    final String CONTINUE_HIGHLOWAVG = "Would you like to enter a new set of numbers?";

    public int continueCheck(){ return JOptionPane.showConfirmDialog(null, CONTINUE_LINE, "Continue", JOptionPane.YES_NO_OPTION); }
    public int continueFruit(){ return JOptionPane.showConfirmDialog(null, CONTINUE_FRUIT, "Continue", JOptionPane.YES_NO_OPTION); }
    public int continueReverser(){ return JOptionPane.showConfirmDialog(null, CONTINUE_REVERSER, "Continue", JOptionPane.YES_NO_OPTION); }
    public int continueSeparator(){ return JOptionPane.showConfirmDialog(null, CONTINUE_SEPARATOR, "Continue", JOptionPane.YES_NO_OPTION); }
    public int continueHighLowAvg() { return JOptionPane.showConfirmDialog(null, CONTINUE_HIGHLOWAVG, "Continue", JOptionPane.YES_NO_OPTION); }
}
