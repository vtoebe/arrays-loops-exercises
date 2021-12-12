package com.vtoebe.arrays_loops.guest_list.utils;

import com.vtoebe.arrays_loops.guest_list.service.ListHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestListWriter {
    Scanner scan = new Scanner(System.in);
    ListHandler list = new ListHandler();

    private ArrayList<String> guestList = new ArrayList<String>();

    public ArrayList<String> getGuestList() { return guestList; }
    public int getListSize(){ return guestList.size(); }

    public void addGuestToList(){
        String name = scan.nextLine();
        if (name.toUpperCase().equals("STOP")){
            list.stopAddingNames();
        } else { guestList.add(name); }

    }

}
