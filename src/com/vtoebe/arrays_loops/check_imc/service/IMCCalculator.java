package com.vtoebe.arrays_loops.check_imc.service;

import com.vtoebe.arrays_loops.check_imc.entities.Person;

import java.util.ArrayList;

public class IMCCalculator {

    private String underWeight = "";
    private String overWeight = "";
    public String checkPeopleIMC(ArrayList<Person> personList){

        for (Person person:personList) {
            float imc = calcIMC(person.getWeight(), person.getHeight());
            if (imc < 18.5){
                underWeight += "\n" + person.getName() + " is under weight and has an IMC of: " + imc;
            }

            if (imc > 25){
                overWeight += "\n" + person.getName() + " is over weight and has an IMC of: " + imc;
            }
        }

        return overWeight + "\n" + underWeight;
    }

    public float calcIMC(float weight, float height){ return (weight/(height*height)); }
}
