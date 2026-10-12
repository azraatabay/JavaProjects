package com.azraatabay.list.Queue.AcilServisUygulamasi;

public class Hasta implements Comparable<Hasta>{

    private String isim;
    private String sikayet;
    private int oncelik;

    @Override
    public String toString() {
        String bilgiler = "Hastanın adı : "+ isim
                          +"\n Şikayet : "+ sikayet
                          +"\n Öncelik sırası : " + oncelik;
        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {
        if (this.oncelik>hasta.oncelik){
            return -1;
        }
        else if (this.oncelik<hasta.oncelik){
            return 1;
        }
        return 0;
    }
    

    public Hasta(String isim, String sikayet){
        this.isim= isim;
        this.sikayet= sikayet;
        if (sikayet.equals("Apandisit")){
            this.oncelik= 3;
        }
        else if (sikayet.equals("Yanık")){
            this.oncelik=2;
        }
        else {
            this.oncelik=1;
        }

    }
}
