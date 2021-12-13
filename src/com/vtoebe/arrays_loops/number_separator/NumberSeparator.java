package com.vtoebe.arrays_loops.number_separator;

import com.vtoebe.arrays_loops.number_separator.service.Separator;
import com.vtoebe.arrays_loops.number_separator.utils.SeparateNumbersPrinter;
import com.vtoebe.arrays_loops.number_separator.utils.SeparateNumbersWriter;
import com.vtoebe.arrays_loops.service.ContinuityChecker;

public class NumberSeparator {
    public static void main(String[] args){
        ContinuityChecker continuity = new ContinuityChecker();

        SeparateNumbersPrinter print = new SeparateNumbersPrinter();
        SeparateNumbersWriter write = new SeparateNumbersWriter();
        Separator separate = new Separator();


            write.setInputNumbers(print.requestNumbers());
            separate.separateAllNumbers(write.getInputNumbers());

    }
}
