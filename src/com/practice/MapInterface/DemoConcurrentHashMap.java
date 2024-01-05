package com.practice.MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> mydata = new ConcurrentHashMap<Integer,Integer>();

        mydata.put(35,78);
        mydata.put(45,12);
        mydata.put(33,88);
        mydata.put(67,55);        //Does not allow null as a value and key
        mydata.put(40,79);

        Iterator iterator = mydata.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
