package com.azraatabay.Main;

import java.util.*;

public class ListiteratorveIteratorFarki {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("*****************************");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("*****************************");

        System.out.println("**********************************************");

        ListIterator<String> iterator3 = list.listIterator();
        while (iterator3.hasNext()){

            System.out.println(iterator3.next());
        }

        System.out.println("**********************************************");

        while (iterator3.hasPrevious()){
            System.out.println(iterator3.previous());
        }
        System.out.println("**********************************************");

        while (iterator3.hasNext()){
            String value = iterator3.next();
            if (value.equals("Go")){
                iterator3.remove();
            }
        }
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("**********************************************");


    }
}

//ListItertor sadece list interface'ini implemente eden classlarda kullanılabilir next previous ve ek olarak add metodu bulunur
//Iterator'ı ise set,queue ve list interfaceini impelemene eden classlarda kullnabiliriz
//Iteratorda listitertordan farklı olarak previos metodu yoktur

