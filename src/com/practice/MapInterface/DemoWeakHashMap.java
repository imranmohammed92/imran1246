package com.practice.MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class DemoWeakHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> mydata = new WeakHashMap<Integer, Integer>();

        mydata.put(35,78);
        mydata.put(45,12);
        mydata.put(33,88); // allows null as key and value pair , data neither sorted nor ordered
        mydata.put(null,11);
        mydata.put(99,null);

        Iterator iterator = mydata.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
