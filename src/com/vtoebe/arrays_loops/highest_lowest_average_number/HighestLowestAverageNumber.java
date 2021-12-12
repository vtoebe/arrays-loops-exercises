package com.vtoebe.arrays_loops.highest_lowest_average_number;


import com.vtoebe.arrays_loops.highest_lowest_average_number.utils.HighLowAvgPrinter;
import com.vtoebe.arrays_loops.highest_lowest_average_number.utils.HighLowAvgWriter;

public class HighestLowestAverageNumber {
    public static void main(String[] args) {
        HighLowAvgPrinter print = new HighLowAvgPrinter();
        HighLowAvgWriter write = new HighLowAvgWriter();

        write.inputNumbers(print.numberRequest());
        print.HighLowAvgResult(write.HighLowAvgFound());
    }
}
