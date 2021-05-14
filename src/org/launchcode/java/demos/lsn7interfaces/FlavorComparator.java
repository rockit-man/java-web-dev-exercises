package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {

//        return o1.getName().compareTo(o2.getName());
//        return o2.getName().compareTo(o1.getName());

        return o2.getAllergens().size() - o1.getAllergens().size();
    }

//    @Override
//    public int compare(Flavor o1, org.launchcode.java.demos.lsn7interfaces.Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }

}
