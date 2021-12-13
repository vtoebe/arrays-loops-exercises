package com.vtoebe.arrays_loops.guest_list;

import com.vtoebe.arrays_loops.guest_list.service.ListHandler;
import com.vtoebe.arrays_loops.guest_list.service.LongestNameFinder;
import com.vtoebe.arrays_loops.guest_list.utils.GuestListPrinter;
import com.vtoebe.arrays_loops.guest_list.utils.GuestListWriter;

public class GuestList {
    public static void main(String[] args) {
        LongestNameFinder find = new LongestNameFinder();
        GuestListWriter write = new GuestListWriter();
        GuestListPrinter print = new GuestListPrinter();
        ListHandler list = new ListHandler();

        do{
            print.nameRequest();
            write.addGuestToList();

        } while (list.checkListSize(write.getListSize()));

        print.longestName(
                find.findLongestName(write.getGuestList())
        );
    }
}
