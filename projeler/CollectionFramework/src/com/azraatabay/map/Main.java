package com.azraatabay.map;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<Integer,String> hashMap = new HashMap<Integer,String >();
        Map<Integer,String> linkedhashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();

        System.out.println("***********************************************");
        mapYazdir(hashMap);
        System.out.println("***********************************************");
        mapYazdir(linkedhashMap);
        System.out.println("***********************************************");
        mapYazdir(treeMap);

    }
    public static void mapYazdir(Map<Integer,String> map){
        map.put(10,"C++");
        map.put(5,"Java");
        map.put(1,"Python");
        map.put(2,"Php");
        map.put(100, "C");

        /*for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Anahtar : "+ entry.getKey() + " -----> Değer : "+ entry.getValue());
        }*/

        //System.out.println(map.keySet());

        for (Integer key : map.keySet()){
            System.out.println("Anahtar : "+ key + "----> Değer : "+ map.get(key));
        }
        System.out.println("***************************************");
        Collection<String> values = map.values();
        for (String s: values){
            System.out.println("Değer : "+ s);
        }
    }
}