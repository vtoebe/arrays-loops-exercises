package com.vtoebe.arrays_loops.reverse_name;

import com.vtoebe.arrays_loops.reverse_name.service.Reverser;
import com.vtoebe.arrays_loops.reverse_name.utils.ReverserPrinter;
import com.vtoebe.arrays_loops.reverse_name.utils.ReverserWriter;
import com.vtoebe.arrays_loops.service.ContinuityChecker;

public class ReverseName {
    public static void main(String[] args){
        ReverserPrinter print = new ReverserPrinter();
        ReverserWriter write = new ReverserWriter();
        Reverser reverse = new Reverser();
        ContinuityChecker continuity = new ContinuityChecker();

        do{
            write.setName(print.nameRequest());
            print.resultMessage(
                    write.reverseResult(
                            reverse.reverseName(write.getName())
                    )
            );
        }while(continuity.checkReverser());
    }
}
