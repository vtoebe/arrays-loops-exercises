package com.vtoebe.arrays_loops.check_imc.service;

import com.vtoebe.arrays_loops.check_imc.entities.Person;

import java.util.ArrayList;

public class PersonListHandler {

    private ArrayList<Person> personList = new ArrayList<>();

    public ArrayList<Person> getPersonList() { return personList; }

    public void setPersonList(Person person) { this.personList.add(person); }

}
