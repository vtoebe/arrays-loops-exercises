package com.vtoebe.arrays_loops.service;

import com.vtoebe.arrays_loops.utils.Printer;

public class ContinuityChecker {
    Printer print = new Printer();

    public boolean check(){ return print.continueCheck() == 0; }
    public boolean checkFruit(){ return print.continueFruit() == 0; }
    public boolean checkReverser(){ return print.continueReverser() == 0; }
    public boolean checkSeparator(){ return print.continueSeparator() == 0; }
    public boolean checkHighLowAvg(){ return print.continueHighLowAvg() == 0; }
}
