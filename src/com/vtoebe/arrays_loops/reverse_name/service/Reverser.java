package com.vtoebe.arrays_loops.reverse_name.service;

public class Reverser {
    public String reverseName(String name){
        String reversedName = "";
        char[] nameCharacters = name.toCharArray();
        for (int i = nameCharacters.length-1; i>=0; i--) {
            reversedName += nameCharacters[i];
        }
        return reversedName;
    }
}
