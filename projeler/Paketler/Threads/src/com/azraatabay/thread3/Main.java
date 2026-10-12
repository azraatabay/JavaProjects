package com.azraatabay.thread3;

import java.util.Collections;

public class Main {
    public static void main(String[] args){
        System.out.println("main thread çaışıyor...");
//anonim class yöntemiyle thread oluşturmak

        /*Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                for(int i = 1 ; i<=10 ; i++){
                    System.out.println("Yazıyor : "+ i );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException oluştu.");
                    }
                }
            }
        });             bu şekilde yaptığımızda bir değişkene atadığımız için başka yerde de kullanabiliriz bu anonim classı
        printer1.start(); */

        new Thread(new Runnable() {
            //burada bir değişkene atamadığımız için bu anonim classı başka yerde kullanamayz
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                for(int i = 1 ; i<=10 ; i++){
                    System.out.println("Yazıyor : "+ i );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException oluştu.");
                    }
                }
            }

        }).start(); //sadece burada kullanabiliriz bu threadi


    }
}
