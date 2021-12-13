package com.vtoebe.arrays_loops.word_formater.utils;

import java.util.Scanner;

public class WordFormaterWriter {
    Scanner scan = new Scanner(System.in);

    private String word = "";
    private String formatedWord = "";

    public String getWord() {
        return word;
    }

    public void setWord() {
        this.word = scan.nextLine();
    }


}
