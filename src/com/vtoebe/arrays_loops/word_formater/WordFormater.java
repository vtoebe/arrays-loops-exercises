package com.vtoebe.arrays_loops.word_formater;

import com.vtoebe.arrays_loops.word_formater.service.Formater;
import com.vtoebe.arrays_loops.word_formater.utils.WordFormaterWriter;
import com.vtoebe.arrays_loops.word_formater.utils.WordFormaterPrinter;

public class WordFormater {

    public static void main(String[] args) {
        Formater format = new Formater();
        WordFormaterPrinter print = new WordFormaterPrinter();
        WordFormaterWriter write = new WordFormaterWriter();

        print.requestWord();
        write.setWord();

        print.formatedWord(
                format.formatWord(write.getWord())
        );
    }
}
