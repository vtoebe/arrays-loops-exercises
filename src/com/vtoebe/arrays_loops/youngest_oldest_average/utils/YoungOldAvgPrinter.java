package com.vtoebe.arrays_loops.youngest_oldest_average.utils;

import com.vtoebe.arrays_loops.youngest_oldest_average.entities.Person;
import com.vtoebe.arrays_loops.youngest_oldest_average.service.AgeFinder;
import com.vtoebe.arrays_loops.youngest_oldest_average.service.PersonListHandler;

import java.util.ArrayList;

public class YoungOldAvgPrinter {

    AgeFinder find = new AgeFinder();
    PersonListHandler list = new PersonListHandler();

    final String REQUEST_NAME = "Please, type the person's name: ";
    final String REQUEST_AGE = "Please, type the person's age: ";

    public void requestName(){ System.out.print(REQUEST_NAME); }
    public void requestAge(){ System.out.print(REQUEST_AGE); }

    public void finalResult(ArrayList<Person> personList){

    }


}
