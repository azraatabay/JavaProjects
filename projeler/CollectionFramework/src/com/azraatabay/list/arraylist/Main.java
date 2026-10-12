package com.azraatabay.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>(); //ArrayList List i implemente eder

        //eleman ekleme
        list.add("Java");
        list.add("Phyton");
        list.add("C++");
        System.out.println("*******************************");

        //eleman erişme index no ile
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println("*******************************");
        //for döngüsü ile ekrana bastırmak
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("*******************************");
//for-each ile ekrana bastırmak istersek
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("*******************************");
        //eleman silme
         list.remove(1);
         list.remove("Java");
        for (String s : list){
            System.out.println(s);
        }

    }
}
