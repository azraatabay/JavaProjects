package com.azraatabay.matematik;

public class Matematik implements IMatematik {
    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplamları = " + (a + b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Farkları = " + (a - b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Çarpımları = " + (a * b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölümleri = " + ((double) a / b));
    }

    public static void main(String[] args){

    }
}
