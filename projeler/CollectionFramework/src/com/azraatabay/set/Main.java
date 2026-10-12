package com.azraatabay.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Set<String> set1= new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();

        //HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Php");

        //LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("Php");

        //TreeSet
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("Php");

        System.out.println("**************HashSet*******************");

        for (String s: set1){
            System.out.println(s);
        }
        System.out.println("**************LinkedHashSet*******************");
        for (String s: set2){
            System.out.println(s);
        }
        System.out.println("**************TreeSet*******************");
        for (String s: set3){
            System.out.println(s);
        }

        System.out.println("-----------------------------------------");
        System.out.println(set1.contains("Java"));
        System.out.println(set1.contains("deneme"));//içinde bu eleman var mı diye kontrol ediyor
        System.out.println(set1.isEmpty());//boş mu kontrolü
        set1.remove("Java"); //yazılan elemanı siler

        System.out.println("----------------------------------------------");

        //iki set kümesi arasındaki farkı bulma yöntemi

        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("Java");
        s1.add("C++");
        s1.add("Python");
        s1.add("JavaScript");
        s1.add("Php");

        s2.add("Go");
        s2.add("Java");
        s2.add("CSS");

        //fark bulma
        Set<String> fark = new HashSet<String>(s2);
        //buradaki fark kümesini ilk başta s2 deki elemanlara sahip oldu
        System.out.println(fark.removeAll(s1));
        //sonrasında fark kümesi zaten s2 deki tüm elemanlara sahip s1 dekileri silince ortak olanlarda silinmiş oluyor
        //böylece s2 nin s1 den farkını bulmuş oluyoruz
        System.out.println(fark);

        //kesişim bulma
        Set<String> kesisim = new HashSet<String>(s2);
        //buradaki kesisim ilk basta s2 nin hepsini alıyor
        System.out.println(kesisim.retainAll(s1));
        //kesisim kümesiyle s1 kümesinin ortak olan elemanlarını tutar
        System.out.println(kesisim);
        //böylece ikisinde de olanları buluruz kesişim kümesini verir





    }
}
