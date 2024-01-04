package com.practice.datastructures;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> mydata = new LinkedHashSet<Integer>();

        mydata.add(45);
        mydata.add(23);
        mydata.add(90);
        mydata.add(67);
        mydata.add(56);
        mydata.add(34);
        Iterator iterator = mydata.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
