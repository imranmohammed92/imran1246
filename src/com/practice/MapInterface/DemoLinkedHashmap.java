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
        mydata.put(null,11);  // allow null as a key and value pair
        mydata.put(99,null);
        mydata.put(55,34);
        mydata.put(67,34);  // does not allow duplicate key and it allows

        Iterator iterator = mydata.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
