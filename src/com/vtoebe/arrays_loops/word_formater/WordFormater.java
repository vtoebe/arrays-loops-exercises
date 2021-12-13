package com.vtoebe.arrays_loops.word_formater;

import com.vtoebe.arrays_loops.word_formater.service.Formater;
import com.vtoebe.arrays_loops.word_formater.utils.WordFormaterOutput;
import com.vtoebe.arrays_loops.word_formater.utils.WordFormaterPrinter;

public class WordFormater {

    public static void main(String[] args) {
        Formater format = new Formater();
        WordFormaterPrinter print = new WordFormaterPrinter();
        WordFormaterOutput out = new WordFormaterOutput();

        print.requestWord();
        out.setWord();

        print.formatedWord(
                format.formatWord(out.getWord())
        );
    }
}
