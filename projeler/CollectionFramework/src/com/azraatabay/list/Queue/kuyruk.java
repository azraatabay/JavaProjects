package com.azraatabay.list.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class kuyruk {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulaması");
        Random random = new Random();
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        pide_kuyrugu.offer("Azra");
        pide_kuyrugu.offer("Mert");
        pide_kuyrugu.offer("Beyza");
        pide_kuyrugu.offer("Kerem");
        pide_kuyrugu.offer("Çınar");
        pide_kuyrugu.offer("Ceren");
        pide_kuyrugu.offer("Petek");
        pide_kuyrugu.offer("Beren");
        pide_kuyrugu.offer("Eda");
        pide_kuyrugu.offer("Doğa");

        int pide_sayisi = 1+ random.nextInt(10);
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayısı : "+ pide_sayisi);
        Thread.sleep(3000);

        while(pide_sayisi != 0){
            System.out.println(pide_kuyrugu.poll()+ " pideyi aldı.");
            pide_sayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı...");
    }
}

