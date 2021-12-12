package com.vtoebe.arrays_loops.highest_lowest_average_number;

import com.vtoebe.arrays_loops.highest_lowest_average_number.utils.HighLowAvgPrinter;
import com.vtoebe.arrays_loops.highest_lowest_average_number.utils.HighLowAvgWriter;
import com.vtoebe.arrays_loops.service.ContinuityChecker;

public class HighestLowestAverageNumber {
    public static void main(String[] args) {
        ContinuityChecker continuity = new ContinuityChecker();
        HighLowAvgPrinter print = new HighLowAvgPrinter();
        HighLowAvgWriter write = new HighLowAvgWriter();

        do{
            write.inputNumbers(print.numberRequest());
            print.HighLowAvgResult(write.HighLowAvgFound());
        } while (continuity.checkHighLowAvg());
    }
}
