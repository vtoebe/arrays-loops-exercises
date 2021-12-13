package com.vtoebe.arrays_loops.youngest_oldest_average;

import com.vtoebe.arrays_loops.youngest_oldest_average.entities.Person;
import com.vtoebe.arrays_loops.youngest_oldest_average.service.AgeFinder;
import com.vtoebe.arrays_loops.youngest_oldest_average.service.PersonListHandler;
import com.vtoebe.arrays_loops.youngest_oldest_average.utils.YoungOldAvgPrinter;
import com.vtoebe.arrays_loops.youngest_oldest_average.utils.YoungOldAvgWriter;

public class YoungestOldestAverage {
    public static void main(String[] args) {
        YoungOldAvgPrinter print = new YoungOldAvgPrinter();
        YoungOldAvgWriter write = new YoungOldAvgWriter();
        PersonListHandler list = new PersonListHandler();
        AgeFinder find = new AgeFinder();

        int i = 0;
        while (i < 5){
            print.requestName();
            write.setName();
            print.requestAge();
            write.setAge();

            Person newPerson = new Person(write.getName(),write.getAge());

            list.setPersonList(newPerson);
            i++;
        }

        System.out.print(find.oldest(list.getPersonList()) +
                "\n" + find.youngest(list.getPersonList()) +
                "\n" + find.averageAge(list.getPersonList())
        );
    }
}
