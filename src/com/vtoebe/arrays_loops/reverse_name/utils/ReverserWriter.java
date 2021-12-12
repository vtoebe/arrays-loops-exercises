package com.vtoebe.arrays_loops.reverse_name.utils;

public class ReverserWriter {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String reverseResult(String reversedName){
        return "The name " + this.getName() +
                " in reverse is: " + reversedName;
    }
}
