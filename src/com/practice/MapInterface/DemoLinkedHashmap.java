package com.practice.MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashmap {
    public static void main(String[] args) {
        Map<Integer, Integer> mydata = new LinkedHashMap<Integer, Integer>();

        mydata.put(35,78);
        mydata.put(45,12);
        mydata.put(33,88);
        mydata.put(null,11);
        mydata.put(99,null);

        Iterator iterator = mydata.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
