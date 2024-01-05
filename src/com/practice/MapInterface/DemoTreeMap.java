package com.practice.MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        Map<Integer, Integer> mydata = new TreeMap<Integer,Integer>();

        mydata.put(35,78);
        mydata.put(45,12);
        mydata.put(33,88);
        mydata.put(66,11); // does not allow null as a key
        mydata.put(99,null); // data sorted by default ascending oder

        Iterator iterator = mydata.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
