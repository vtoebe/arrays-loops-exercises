package com.vtoebe.arrays_loops.number_separator;

import com.vtoebe.arrays_loops.number_separator.service.Separator;
import com.vtoebe.arrays_loops.number_separator.utils.SeparateNumbersPrinter;
import com.vtoebe.arrays_loops.number_separator.utils.SeparateNumbersWriter;

public class NumberSeparator {
    public static void main(String[] args){

        SeparateNumbersPrinter print = new SeparateNumbersPrinter();
        SeparateNumbersWriter write = new SeparateNumbersWriter();
        Separator separate = new Separator();

            print.requestNumbers();
            write.setInputNumbers();

        separate.separateAllNumbers(write.getInputNumbers());



    }
}
