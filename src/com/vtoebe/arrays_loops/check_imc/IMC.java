package com.vtoebe.arrays_loops.check_imc;

import com.vtoebe.arrays_loops.check_imc.service.IMCCalculator;
import com.vtoebe.arrays_loops.check_imc.service.PersonListHandler;
import com.vtoebe.arrays_loops.check_imc.utils.IMCPrinter;
import com.vtoebe.arrays_loops.check_imc.utils.IMCWriter;
import com.vtoebe.arrays_loops.check_imc.entities.Person;

public class IMC {
    public static void main(String[] args) {
        IMCCalculator calc = new IMCCalculator();
        IMCPrinter print = new IMCPrinter();
        IMCWriter write = new IMCWriter();
        PersonListHandler list = new PersonListHandler();

        int i = 0;
        while (i < 5){
            print.requestName();
            write.setName();
            print.requestHeight();
            write.setHeight();
            print.requestWeight();
            write.setWeight();

            Person newPerson = new Person(write.getName(),write.getHeight(), write.getWeight());

            list.setPersonList(newPerson);
            i++;
        }

        System.out.println(
                calc.checkPeopleIMC(list.getPersonList())
        );

    }
}
