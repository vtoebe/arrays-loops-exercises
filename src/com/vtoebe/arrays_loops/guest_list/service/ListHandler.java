package com.vtoebe.arrays_loops.guest_list.service;

import com.vtoebe.arrays_loops.guest_list.utils.GuestListWriter;

import java.util.ArrayList;
import java.util.Objects;

public class ListHandler {

    public boolean checkListSize(int listSize){ return listSize < 5; }
    public boolean stopAddingNames() { return true; }

}
