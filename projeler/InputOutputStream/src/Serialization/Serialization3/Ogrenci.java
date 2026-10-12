package Serialization.Serialization3;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    private String isim;
    private int id;
    private String bolum;
    private static int ogreni_sayisi =0;

    //transient anahtar kelimesi serileştirmek istemediğimiz özellikler için kullanılır

    public Ogrenci (String isim, int id, String bolum){
        this.isim= isim;
        this.id = id;
        this.bolum = bolum;
    }
    @Override
    public String toString() {
        String bilgiler = "Öğrenci ismi : "+ isim +
                "\nÖğrenci numarası : " + id +
                "\nÖğrenci bölümü : " + bolum;
        return bilgiler;
    }

    public static int getOgreni_sayisi() {
        return ogreni_sayisi;
    }

    public static void setOgreni_sayisi(int ogreni_sayisi) {
        Ogrenci.ogreni_sayisi = ogreni_sayisi;
    }
}
