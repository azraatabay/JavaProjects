package com.azraatabay.thread2;

public class Printer implements Runnable{
    //Runnable içindeki run metodu yazılırsa bu class thread olarak kullanılabilir

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " Çalışıyor...");
        for (int i =1 ; i<=10 ; i++){
            System.out.println(isim + " yazıyor : "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı");
            }
        }
        System.out.println("Thread işini bitirdi...");
    }
}
