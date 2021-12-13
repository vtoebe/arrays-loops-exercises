package com.vtoebe.arrays_loops.youngest_oldest_average.service;

import com.vtoebe.arrays_loops.youngest_oldest_average.entities.Person;

import java.util.ArrayList;

public class AgeFinder {
    private Integer personAge;
    private String personName;

    public String oldest(ArrayList<Person> personList){
        resetFinder();
        for (Person person:personList) {
            if (personAge == null){
                personAge = person.getAge();
                personName = person.getName();
            } else if (person.getAge() > personAge) {
                personAge = person.getAge();
                personName = person.getName();
            }
        }
        return "Oldest person is: " + personName +
                " with " + personAge + " years old!";
    }

    public String youngest(ArrayList<Person> personList){
        resetFinder();
        for (Person person:personList) {
            if (personAge == null){
                personAge = person.getAge();
                personName = person.getName();
            } else if (person.getAge() < personAge) {
                personAge = person.getAge();
                personName = person.getName();
            }
        }
        return "Youngest person is: " + personName +
                " with " + personAge + " years old!";
    }

    public String averageAge(ArrayList<Person> personList){
        personAge = 0;
        int i = 0;
        for (Person person:personList) {
            personAge += person.getAge();
            i++;
        }
        return "Average age of the group is: " + (personAge/i);
    }


    public void resetFinder(){
        personName = "";
        personAge = null;
    }
}
