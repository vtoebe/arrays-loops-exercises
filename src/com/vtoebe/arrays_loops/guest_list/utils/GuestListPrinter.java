package com.vtoebe.arrays_loops.guest_list.utils;

public class GuestListPrinter {
    final String NAME_REQUEST = "Add a name to the guest list: ";
    final String SIZE_CHECK = "Your list has to have at least five names: ";
    final String KEEP_ADDING_NAMES = "If you want to stop adding names, type STOP: ";
    final String LONGEST_NAME = "The longest name in the list is: ";

    public void nameRequest(){ System.out.print(NAME_REQUEST); }
    public void wrongSize(){ System.out.println(SIZE_CHECK); }
    public void keepAddingNames(){ System.out.println(KEEP_ADDING_NAMES); }
    public void longestName(String name){ System.out.println(LONGEST_NAME + name); }
}
