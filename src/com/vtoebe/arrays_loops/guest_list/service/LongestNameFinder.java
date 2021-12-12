package com.vtoebe.arrays_loops.guest_list.service;

public class LongestNameFinder {
        private String longestName;

    public String findLongestName(String[] names){

        int nameSize = 0;
        for (String name: names) {
            if (name.length() > nameSize){
                nameSize = name.length();
                longestName = name;
            }
        }

        return longestName;
    }
}
