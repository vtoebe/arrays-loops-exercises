package com.vtoebe.arrays_loops.word_formater.utils;

public class WordFormaterPrinter {
    final String REQUEST_WORD = "Please, type a word to be formated: ";
    final String FORMATED_WORD = "Your word formated looks like this: ";

    public void requestWord(){
        System.out.println(REQUEST_WORD);
    }

    public void formatedWord(String formatedWord){
        System.out.println(FORMATED_WORD + formatedWord);
    }
}
