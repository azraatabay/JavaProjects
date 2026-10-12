package com.azraatabay.list.Vectorler;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Vector<String> vector = new Vector<String>();
        ArrayList<String> list = new ArrayList<String>();

        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

        /*for (String s : vector){
            System.out.println(s);
        }*/

        /*ListIterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        } */

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        System.out.println("***********************************");
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println("************************************");

        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("Pyhton");
        stack.push("Php");
        stack.push("Go");

       /* for (String s : stack){
            System.out.println(s);
        }*/
        System.out.println("******************************");
        System.out.println(stack.peek());; //son eklenen elemana göz atar
        stack.pop();//son eklenen elemanı siler
        System.out.println(stack.empty());;//stack boşsa true değilse false döner
        System.out.println("*****************************");
        Enumeration<String> enumeration1 = stack.elements();
        while (enumeration1.hasMoreElements()){
            System.out.println(enumeration1.nextElement());
        }
        System.out.println("**********************************");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.empty());

    }
}
