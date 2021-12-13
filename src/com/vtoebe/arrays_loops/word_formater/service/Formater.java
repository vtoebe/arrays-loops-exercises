package com.vtoebe.arrays_loops.word_formater.service;

public class Formater {

    public String formatWord(String word){
        String formatedWord = "";
        char[] wordCharacters = word.toCharArray();

        int ii = 1;
        int i = 0;
        for (char wordChar:wordCharacters) {
            if(ii%2!=0){
                formatedWord += Character.toUpperCase(word.charAt(i));
            } else{
                formatedWord += Character.toLowerCase(word.charAt(i));
            }
            i++;
            ii++;
        }

        return formatedWord;
    }
}
