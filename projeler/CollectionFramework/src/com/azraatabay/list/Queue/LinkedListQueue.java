package com.azraatabay.list.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("Pyhton");
        queue.offer("Php");
        queue.offer("C++");

        //System.out.println(queue.peek());
        for (String s : queue){
            System.out.println(s);
        }
        System.out.println("*********************************");
        System.out.println("Eleman çıkarılıyor : "+ queue.poll());
        for (String s : queue){
            System.out.println(s);
        }
        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()){
            System.out.println("Eleman çıkarılıyor : "+ queue.poll());
        }

    }
}
