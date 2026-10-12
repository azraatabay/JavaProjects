package com.azraatabay.thread1;

public class Printer extends Thread {
    private String isim;

    public Printer(String isim) {
        //Thread oluşturmak için Thread classından extends edilmesi gerekir
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " Çalışıyor...");
        for(int i = 1 ; i<=10; i++){
            System.out.println(isim + " Yazıyor : "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı... ");
            }
        }
        System.out.println(isim + " işini bitirdi.");
    }
}
