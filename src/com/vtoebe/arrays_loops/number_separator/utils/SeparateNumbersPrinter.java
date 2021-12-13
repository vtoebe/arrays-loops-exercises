package com.vtoebe.arrays_loops.number_separator.utils;

import java.util.ArrayList;

public class SeparateNumbersPrinter {

    final String NUMBERS_REQUEST = "Please enter at least 5 numbers: ";

    public void requestNumbers(){ System.out.print(NUMBERS_REQUEST);  }

    public void separationResult(ArrayList<Integer> odd, ArrayList<Integer> even){
        System.out.println("==== Results ====");
        System.out.println("-- Odd Numbers --");
        for (int num: odd){ System.out.print(num + "\t"); }
        System.out.println("\n-- Even Numbers --");
        for (int num: even){ System.out.print(num + "\t"); }
    }

}
