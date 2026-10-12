package Serialization.Serialization1;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    private static final long SerialVersionUID = 1000;
    //burası sayesinde bu class değişirse bu classın farklı olduğu anlışacak güvenlik açısından gereklidir
 private String isim;
 private int id;
 private String bolum;
 private String dersler;

 public Ogrenci(String isim, int id, String bolum){
     this.isim = isim;
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
}
